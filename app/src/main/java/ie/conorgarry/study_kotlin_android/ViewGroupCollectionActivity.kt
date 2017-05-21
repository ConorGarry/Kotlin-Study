package ie.conorgarry.study_kotlin_android

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_viewgroup.*
import timber.log.Timber

/**
 * Created by conor on 21/05/2017.
 *
 * Primarily from Jake Wharton's section of I/O talk
 * Allowing ViewGroups to behave more like Collections.
 */

class ViewGroupCollectionActivity : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            val starter = Intent(context, ViewGroupCollectionActivity::class.java)
            //        starter.putExtra();
            context.startActivity(starter)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewgroup)
//        iterate()
//        iterateAndIndex()
//        getViewByIndex(1)
//        addViewThenRemove()
//        checkForView()
//        printViewSize()
        iterateForEach()
        getTotalContainingChar('3')

    }

    private fun printViewSize() {
        Timber.d("View count: ${ll_text_wrapper.size}")
    }

    private fun getViewByIndex(i: Int) {
        Timber.d("View 2: ${(ll_text_wrapper[i] as TextView).text}")
    }

    fun iterate() {
        ll_text_wrapper.forEach { view -> Timber.d("View v: ${(view as TextView).text}") }
    }

    fun iterateAndIndex() {
        ll_text_wrapper.forEachIndexed { index, view ->
            Timber.d("View: i: ${index} text: ${(view as TextView).text}")
        }
    }

    /**
     * Add TextView then remove after 3s
     * */
    fun addViewThenRemove() {
        val tv = TextView(this)
        tv.text = "Wildcard Baby!"
        ll_text_wrapper += tv
        Handler().postDelayed({ ll_text_wrapper -= tv }, 3000)
    }

    fun checkForView() {
        val tv = ll_text_wrapper[0] as TextView
        Timber.d("ViewGroup has view: ${tv in ll_text_wrapper}")
    }

    fun iterateForEach() {
        for (v in ll_text_wrapper.children()) {
            Timber.d("View: ${(v as TextView).text}")
        }
    }

    fun getTotalContainingChar(c: Char) {
        var i = ll_text_wrapper.children()
                .filter { (it as TextView).text.contains(c) }
                .count()
        Timber.d("Total containing '${c}': ${i}")
    }
}
