package ie.conorgarry.study_kotlin_android

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ie.conorgarry.study_kotlin_android.model.MainMenuItemViewModel
import kotlinx.android.synthetic.main.item_layout.view.*

/**
 * A custom adapter to use with the RecyclerView widget.
 */
class RvMainMenuAdapter(items: List<MainMenuItemViewModel>) : RecyclerView.Adapter<RvMainMenuAdapter.ViewHolder>() {

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
        fun bindView(vm: MainMenuItemViewModel) {
            itemView.tv_menu_item.text = vm.menuTitle
            itemView.setOnClickListener({ (itemView.context.startActivity(Intent(itemView.context, vm.activity)))})
        }
    }
}
