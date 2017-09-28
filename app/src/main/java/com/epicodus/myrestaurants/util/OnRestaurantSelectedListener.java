package com.epicodus.myrestaurants.util;

import com.epicodus.myrestaurants.models.Restaurant;

import java.util.ArrayList;

/**
 * Created by dennis on 9/28/17.
 */

public interface OnRestaurantSelectedListener {
    public void onRestaurantSelected(Integer position, ArrayList<Restaurant> restaurants, String source);
}
