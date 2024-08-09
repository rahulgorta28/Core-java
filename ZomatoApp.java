package com.xworkz.zomatoappsystem.foodnames.spotifylogic;

import com.xworkz.zomatoappsystem.foodnames.FoodName;

public class ZomatoApp {

    FoodName foodName;

    public ZomatoApp(FoodName foodName) {
        this.foodName = foodName;
    }
    public void getFoodNames(){
        this.foodName.foodDetails();
    }
}
