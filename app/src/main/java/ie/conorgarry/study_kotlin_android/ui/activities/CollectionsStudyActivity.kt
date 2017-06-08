package ie.conorgarry.study_kotlin_android.ui.activities

import android.os.Bundle
import ie.conorgarry.study_kotlin_android.R
import timber.log.Timber

/**
 * Created by conor on 21/05/2017.
 */

class CollectionsStudyActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collections)
        Timber.d("Started collections Study activity")
    }
}
