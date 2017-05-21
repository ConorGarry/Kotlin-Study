package ie.conorgarry.study_kotlin_android

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_layout.view.*

/**
 * A custom adapter to use with the RecyclerView widget.
 */
class RvMainMenuAdapter(items: List<String>) : RecyclerView.Adapter<RvMainMenuAdapter.ViewHolder>() {

    var mItems = items

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_layout, viewGroup, false)
        view.layoutParams.height = viewGroup.measuredHeight / 8
        return ViewHolder(view)
    }

    override fun onBindViewHolder(itemViewHolder: ViewHolder, position: Int) {
        itemViewHolder.bindView(mItems[position])
    }

    override fun getItemCount(): Int {
        return mItems.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(s: String) {
            itemView.tv_menu_item.text = s
            itemView.setOnClickListener({ ViewGroupCollectionActivity.start(itemView.context)})
        }
    }
}
