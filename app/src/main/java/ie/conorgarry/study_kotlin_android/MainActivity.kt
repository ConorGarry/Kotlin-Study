package ie.conorgarry.study_kotlin_android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Landing page of Kotlin Study, holds  a menu that leads to sub categorised studies.*
 *
 * */

class MainActivity : AppCompatActivity() {

    companion object {
        val mMenuItems: MutableList<String> = mutableListOf("ViewGroup Collections")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_main_text.visibility = View.GONE
        rv_main_menu.adapter = RvMainMenuAdapter(mMenuItems)
        rv_main_menu.layoutManager = LinearLayoutManager(this)
    }
}
