import java.util.*;
class Amazon1{
	
	static String ProductNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addProductName(String ProductName){
	
	boolean isProductNameAdded = false;
	
		if(index < ProductNames.length){
		 if(ProductName!= null){
			ProductNames[index++] = ProductName;
			
		}else
			System.out.println("The Product Name is invalid");
		}else
			System.out.println("Sorry Product name is full:");
		return isProductNameAdded = true;
}
		 public static void printProductNames(){
		 for(String ProductName:ProductNames){
		
		System.out.println("The Product Names are:" + ProductName);
		
		}
		
	
		 }
		 public static boolean updateProductName(String oldProductName , String newProductName){
			 
			 System.out.println("The Update method started");
			 
			boolean isProductNameUpdated = false;
			
			for(int position=0 ; position<ProductNames.length;position++){
				
				if(ProductNames[position] == oldProductName){
					ProductNames[position] = newProductName;
				
				  isProductNameUpdated = true;
			    }
	        }
			if(isProductNameUpdated == false)
				System.out.println(oldProductName + "not found");
		 
		    return isProductNameUpdated;
		 }
		 public static boolean deleteProductName(String delete){

			System.out.println("The Delete method started");
		
		boolean isProductNameDeleted = false;
		int position, newPosition;
		for(position = 0 , newPosition = 0 ; position<ProductNames.length ; position++){
			if(ProductNames[position]!=delete){
				ProductNames[newPosition] = ProductNames[position];
				newPosition++;
			}
			else
				isProductNameDeleted = true;
		}
			ProductNames = Arrays.copyOf(ProductNames,newPosition);
			
			if(!isProductNameDeleted)
				System.out.println(delete+" not found");
		return isProductNameDeleted;	
	} 

	}

	
	



