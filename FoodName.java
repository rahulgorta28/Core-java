package com.xworkz.zomatoappsystem.foodnames;

public class FoodName {
    public String foodName;
    public int foodPrice;
    public String foodType;

    public FoodName(String foodName, int foodPrice, String foodType) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodType = foodType;
    }
    public void foodDetails(){
        System.out.println("The Food name is:" + foodName);
        System.out.println("The Food price is:" + foodPrice);
        System.out.println("The Food Type is:" + foodType);
    }
}
