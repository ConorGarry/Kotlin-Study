package ie.conorgarry.study_kotlin_android.ui.activities

import android.os.Bundle
import ie.conorgarry.study_kotlin_android.R
import timber.log.Timber

/**
 * Created by conor on 21/05/2017.
 */

class HigherOrderFuncActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_higher_order)
        Timber.d(higherOrder("hello", {it.toUpperCase()}))
        // Also allowed
        Timber.d(higherOrder("hEllO", ::toLowerCase))
    }
}
/**
 * Higher Order Functions are functions that take a function as a parameter, or returns one.
 * */
fun higherOrder(value: String, op: (String) -> String) : String {
    Timber.d("Executing operation: $op")
    return op(value)
}

fun toLowerCase(s: String) = s.toLowerCase()
