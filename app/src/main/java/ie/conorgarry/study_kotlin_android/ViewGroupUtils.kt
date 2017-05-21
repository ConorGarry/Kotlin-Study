package ie.conorgarry.study_kotlin_android

import android.view.View
import android.view.ViewGroup

/**
 * Created by conor on 21/05/2017.
 *
 * Class for holding Extension Functions for ViewGroup
 */

class ViewGroupUtils

// Iterate child Views
// Inline prevents creating anonymous class every time.
inline fun ViewGroup.forEach(action: (View) -> Unit) {
    for (i in 0 until childCount) {
        action(getChildAt(i))
    }
}

// With index
inline fun ViewGroup.forEachIndexed(action: (Int, View) -> Unit) {
    for (i in 0 until childCount) {
        action(i, getChildAt(i))
    }
}

// Getting view by index (view[i])
operator fun ViewGroup.get(index: Int): View? = getChildAt(index)

// Adding / Removing += / -=
operator fun ViewGroup.minusAssign(child: View) = removeView(child)
operator fun ViewGroup.plusAssign(child: View) = addView(child)
// Check if view contained
operator fun ViewGroup.contains(child: View) = indexOfChild(child) != -1

// Expose size of ViewGroup
val ViewGroup.size: Int
    get() = childCount

// Expose Iterator (so we can perform more advanced Collection Higher Order Functions)
fun ViewGroup.children() = object : Iterable<View> {
    override fun iterator() = object : Iterator<View> {
        var i = 0
        override fun hasNext() = i < childCount
        override fun next() = getChildAt(i++)
    }
}

