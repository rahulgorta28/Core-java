package com.xworkz.zomatoappsystem;

import com.xworkz.zomatoappsystem.foodnames.FoodName;
import com.xworkz.zomatoappsystem.foodnames.spotifylogic.ZomatoApp;

public class ZomatoAppRunner {

    public static void main(String[] args) {
        FoodName foodname = new FoodName("Chicken Biryani",120,"Non-Veg");
        ZomatoApp zomatoapp = new ZomatoApp(foodname);
        zomatoapp.getFoodNames();
    }
}
