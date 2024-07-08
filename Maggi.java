class Maggi{

   public static void main(String[] args){
   
   int price = 10;
   String quantity = "20grms";
   String countryOfOrigin = "India";		
   String ingrediants[] = {"Salt","Tapioca Starch","Mineral","Spices","Wheat flour"};
   
   System.out.println("The price of the Maggi is:"+ price);
   System.out.println("The Quantity of the Maggi is:" + quantity);
   System.out.println("The Country of the Origin is" + countryOfOrigin);
   System.out.print("The Ingrediants of the Maggi contains:");
   
   for(String ingrediant : ingrediants){
   System.out.println(ingrediant);
   
   }
   
   
   
   
   
   
   }









}