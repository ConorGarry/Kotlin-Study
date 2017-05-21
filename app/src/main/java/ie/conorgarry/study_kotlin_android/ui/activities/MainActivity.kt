package ie.conorgarry.study_kotlin_android.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import ie.conorgarry.study_kotlin_android.R
import ie.conorgarry.study_kotlin_android.RvMainMenuAdapter
import ie.conorgarry.study_kotlin_android.model.MainMenuItemViewModel
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Landing page of Kotlin Study, holds  a menu that leads to sub categorised studies.*
 *
 * */

class MainActivity : AppCompatActivity() {

    companion object {
        val mMenuItems: MutableList<MainMenuItemViewModel> = mutableListOf(
                MainMenuItemViewModel("Higher Order Functions", HigherOrderFuncActivity::class.java),
                MainMenuItemViewModel("Collections", CollectionsStudyActivity::class.java),
                MainMenuItemViewModel("ViewGroup Collections", ViewGroupCollectionActivity::class.java)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_main_text.visibility = View.GONE
        rv_main_menu.adapter = RvMainMenuAdapter(mMenuItems)
        rv_main_menu.layoutManager = LinearLayoutManager(this)
    }
}
