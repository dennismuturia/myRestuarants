package com.epicodus.myrestaurants.util;

/**
 * Created by dennis on 9/25/17.
 */

public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    boolean onItemDismiss(int position);
}
