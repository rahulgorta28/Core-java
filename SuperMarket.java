class SuperMarket {

     public static void main(String[] args){
	 
	 String groceries[] = {"Milk", "Eggs", "Bread", "Cheese", "Apples", "Bananas", "Chicken Breast", "Ground Beef", "Rice", "Pasta", "Tomatoes", "Carrots", "Potatoes", "Onions", "Butter"};
	 String vegetables[] = {"Carrots", "Broccoli", "Spinach", "Tomatoes", "Cucumbers", "Bell Peppers", "Onions", "Garlic", "Potatoes", "Lettuce"};
	 String perfumes[] = {"Chanel No.5", "Dior Jadore", "Tom Ford Black Orchid", "Yves Saint Laurent Black Opium", "Gucci Bloom", "Marc Jacobs Daisy", "Viktor & Rolf Flowerbomb", "Jo Malone London Peony & Blush Suede", "Dolce & Gabbana Light Blue", "Lancôme La Vie Est Belle", "Prada Candy", "Versace Bright Crystal", "Carolina Herrera Good Girl", "Estée Lauder Beautiful", "Byredo Gypsy Water"};
	 String fruits[] = {"Apples", "Bananas", "Oranges", "Grapes", "Strawberries", "Blueberries", "Mangoes", "Pineapples", "Peaches", "Cherries", "Watermelon", "Kiwis", "Pears", "Lemons", "Avocados"};
	 String snacks[] = {"Potato Chips", "Popcorn", "Pretzels", "Chocolate Bars", "Trail Mix", "Granola Bars", "Crackers", "Nuts", "Cookies", "Candy"};
	 String chocolates[] = {"Hersheys Milk Chocolate", "Cadbury Dairy Milk", "Lindt Lindor", "Ferrero Rocher", "Toblerone", "Ghirardelli Chocolate", "Godiva Chocolate", "Nestlé Crunch", "Reese s Peanut Butter Cups", "Kit Kat", "Snickers", "Twix", "Milky Way", "Dove Chocolate", "M&Ms"};
	 String cosmetics[] = {"Maybelline Great Lash Mascara", "LOréal Paris True Match Foundation", "NARS Radiant Creamy Concealer", "MAC Ruby Woo Lipstick", "Fenty Beauty Pro Filt'r Foundation","Urban Decay Naked Eyeshadow Palette", "Anastasia Beverly Hills Brow Wiz","Tarte Shape Tape Concealer", "Benefit Hoola Bronzer","Clinique Almost Lipstick in Black Honey", "Too Faced Better Than Sex Mascara","Charlotte Tilbury Magic Cream","Estée Lauder Double Wear Foundation","Bobbi Brown Shimmer Brick","NYX Professional Makeup Soft Matte Lip Cream"};
	 String alcohols[] = {"Whiskey", "Vodka", "Rum", "Gin", "Tequila", "Brandy", "Scotch", "Bourbon", "Beer", "Wine", "Champagne", "Cognac", "Sake", "Absinthe", "Vermouth"};
	 String coolDrinks[] = {"Coca-Cola", "Pepsi", "Sprite", "Mountain Dew", "Fanta", "Dr Pepper", "7 Up", "Root Beer", "Ginger Ale", "Tonic Water", "Lemonade", "Iced Tea", "Gatorade", "Red Bull", "Arizona Green Tea"};
	 String iceCreams[] = {"Vanilla", "Chocolate", "Strawberry", "Mint Chocolate Chip", "Cookies and Cream", "Rocky Road", "Butter Pecan", "Mango", "Pistachio", "Coffee", "Chocolate Chip Cookie Dough", "Salted Caramel", "Peanut Butter Cup", "Birthday Cake", "Black Raspberry"};
	 String milkProducts[] = {"Milk", "Cheese", "Butter", "Yogurt", "Cream", "Buttermilk", "Sour Cream", "Cottage Cheese", "Ice Cream", "Kefir"};
	 String homeAppliances[] = {"Refrigerator","Washing Machine","Microwave Oven","Dishwasher","Vacuum Cleaner","Air Conditioner","Coffee Maker","Toaster","Blender","Food Processor","Electric Kettle","Juicer","Oven","Slow Cooker","Steam Iron","Hair Dryer","Electric Fan","Water Heater","Humidifier","Air Purifier"};
	 
	 System.out.println("The main method started");
	 System.out.println("The list of groceries are");
	// System.out.println("The List of Groceries are:" + groceries[0]+","+ groceries[1] +"," + groceries[2] +","+ groceries[3] +","+ groceries[4] +","+ groceries[5]+"," + groceries[6] +","+ groceries[7]+","+ groceries[8]+","+ groceries[9]+","+ groceries[10]+","+ groceries[11]+","+ groceries[12]+","+ groceries[13]+","+ groceries[14]);
	// System.out.println("The List of vegetables are:" + vegetables[0]+","+ vegetables[1] +"," + vegetables[2] +","+ vegetables[3] +","+ vegetables[4] +","+ vegetables[5]+"," + vegetables[6] +","+ vegetables[7]+","+ vegetables[8]+","+ vegetables[9]);
	// System.out.println("The List of perfumes are:" + perfumes[0]+","+ perfumes[1] +"," + perfumes[2] +","+ perfumes[3] +","+ perfumes[4] +","+ perfumes[5]+"," + perfumes[6] +","+ perfumes[7]+","+ perfumes[8]+","+ perfumes[9]+","+ perfumes[10]+","+ perfumes[11]+","+ perfumes[12]+","+ perfumes[13]+","+ perfumes[14]);
	// System.out.println("The List of fruits are:" + fruits[0]+","+ fruits[1] +"," + fruits[2] +","+ fruits[3] +","+ fruits[4] +","+ fruits[5]+"," + fruits[6] +","+ fruits[7]+","+ fruits[8]+","+ fruits[9]+","+ fruits[10]+","+ fruits[11]+","+ fruits[12]+","+ fruits[13]+","+ fruits[14]);
	// System.out.println("The List of snacks are:" + snacks[0]+","+ snacks[1] +"," + snacks[2] +","+ snacks[3] +","+ snacks[4] +","+ snacks[5]+"," + snacks[6] +","+ snacks[7]+","+ snacks[8]+","+ snacks[9]);
	// System.out.println("The List of chocolates are:" + chocolates[0]+","+ chocolates[1] +"," + chocolates[2] +","+ chocolates[3] +","+ chocolates[4] +","+ chocolates[5]+"," + chocolates[6] +","+ chocolates[7]+","+ chocolates[8]+","+ chocolates[9]+","+ chocolates[10]+","+ chocolates[11]+","+ chocolates[12]+","+ chocolates[13]+","+ chocolates[14]);
	// System.out.println("The List of cosmetics are:" + cosmetics[0]+","+ cosmetics[1] +"," + cosmetics[2] +","+ cosmetics[3] +","+ cosmetics[4] +","+ cosmetics[5]+"," + cosmetics[6] +","+ cosmetics[7]+","+ cosmetics[8]+","+ cosmetics[9]+","+ cosmetics[10]+","+ cosmetics[11]+","+ cosmetics[12]+","+ cosmetics[13]+","+ cosmetics[14]);
	// System.out.println("The List of alcohols are:" + alcohols[0]+","+ alcohols[1] +"," + alcohols[2] +","+ alcohols[3] +","+ alcohols[4] +","+ alcohols[5]+"," + alcohols[6] +","+ alcohols[7]+","+ alcohols[8]+","+ alcohols[9]+","+ alcohols[10]+","+ alcohols[11]+","+ alcohols[12]+","+ alcohols[13]+","+ alcohols[14]);
	// System.out.println("The List of coolDrinks are:" + coolDrinks[0]+","+ coolDrinks[1] +"," + coolDrinks[2] +","+ coolDrinks[3] +","+ coolDrinks[4] +","+ coolDrinks[5]+"," + coolDrinks[6] +","+ coolDrinks[7]+","+ coolDrinks[8]+","+ coolDrinks[9]+","+ coolDrinks[10]+","+ coolDrinks[11]+","+ coolDrinks[12]+","+ coolDrinks[13]+","+ coolDrinks[14]);
	// System.out.println("The List of iceCreams are:" + iceCreams[0]+","+ iceCreams[1] +"," + iceCreams[2] +","+ iceCreams[3] +","+ iceCreams[4] +","+ iceCreams[5]+"," + iceCreams[6] +","+ iceCreams[7]+","+ iceCreams[8]+","+ iceCreams[9]+","+ iceCreams[10]+","+ iceCreams[11]+","+ iceCreams[12]+","+ iceCreams[13]+","+ iceCreams[14]);
	// System.out.println("The List of milkProducts are:" + milkProducts[0]+","+ milkProducts[1] +"," + milkProducts[2] +","+ milkProducts[3] +","+ milkProducts[4] +","+ milkProducts[5]+"," + milkProducts[6] +","+ milkProducts[7]+","+ milkProducts[8]+","+ milkProducts[9]);
	// System.out.println("The List of homeAppliances are:" + homeAppliances[0]+","+ homeAppliances[1] +"," + homeAppliances[2] +","+ homeAppliances[3] +","+ homeAppliances[4] +","+ homeAppliances[5]+"," + homeAppliances[6] +","+ homeAppliances[7]+","+ homeAppliances[8]+","+ homeAppliances[9]+","+ homeAppliances[10]+","+ homeAppliances[11]+","+ homeAppliances[12]+","+ homeAppliances[13]+","+ homeAppliances[14]+","+ homeAppliances[15]+","+ homeAppliances[16]+","+ homeAppliances[17]+","+ homeAppliances[18]+","+ homeAppliances[19]); 
		for(String grocery : groceries){
	System.out.println(grocery);
	 }
	 }
}
