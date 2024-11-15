package com.nayeem2021.liilab_app_dev_assesment_project.domain

import android.content.res.Resources
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView


class PaddingInBetweenRecyclerViewDecorator(
    private val paddingValue: Int,
    private val horizontally: Boolean = false
) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        val curPosition = parent.getChildAdapterPosition(view)
        if (curPosition != RecyclerView.NO_POSITION && curPosition != state.itemCount - 1) {
            if(!horizontally) {
                outRect.bottom = dpToPx(paddingValue)
            } else {
                outRect.right = dpToPx(paddingValue)
            }
        }
    }
}

fun dpToPx(dp: Int): Int {
    val density = Resources.getSystem().displayMetrics.density
    return (dp * density).toInt()
}