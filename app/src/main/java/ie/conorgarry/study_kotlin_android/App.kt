package ie.conorgarry.study_kotlin_android

import android.app.Application

import timber.log.Timber

/**
 * Created by conor on 19/05/2017.
 */

var sInstance: App? = null

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        sInstance = this
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

//    companion object {
////        private var sInstance: App? = null
//        const val STRING_CONSTANT = "HELLO_CONSTANT"
//        fun get(): App? {
//            return sInstance
//        }
//    }

    /** Could also be done like this
     *
     * @see [http://stackoverflow.com/a/37412029/3429021](http://stackoverflow.com/a/37412029/3429021)
     * ( ^ links apparently not clickable in Kotlin)
     *
     * "Kotlin doesn't have static fields, but properties in objects are statically accessible."
     * */
//    companion object {
//        lateinit var instance: App
//            private set
//    }
}
