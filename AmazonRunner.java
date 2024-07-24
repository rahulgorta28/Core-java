class AmazonRunner{

    public static void main(String[] args){
  
    boolean createProfile= Amazon.createUserAccount("rahul","Gorta",null,"rahul123@gmail","rahul@123","rahul@123");
  
     if(createProfile==true)
	  Amazon.readUserAccountDetails();
  
  }

}