package ie.conorgarry.study_kotlin_android.ui.activities

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity

/**
 * Created by conor on 21/05/2017.
 */

abstract class BaseActivity : AppCompatActivity() {
    companion object {
        public fun start(context: Context) {
            val starter = Intent(context, BaseActivity::class.java)
            //        starter.putExtra();
            context.startActivity(starter)
        }
    }
}
