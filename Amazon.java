class Amazon{

   static String fstName;
   static String lstName;
   static String dateOfBirth;
   static String mail;
   static String loginPassword;
   static String confirm;
   
   
  public static boolean createUserAccount(String firstName, String lastName, String dob, String email, String password, String confirmPassword)
  {
 
   boolean isAccountCreated = false;
   
   boolean isFirstNameValid = false;
   boolean isLastNameValid = false;
   boolean isDobValid = false;
   boolean isEmailValid = false;
   boolean isPasswordValid = false;
   boolean isConfirmPasswordValid = false;
   
   if(firstName!= null)
   {
   fstName= firstName;
   isFirstNameValid = true;
   }
   else
	   System.out.println("first Name is invalid");
   
   
   if(lastName!= null)
   {
   lstName= lastName;
   isLastNameValid = true;
   }
   else
	   System.out.println("last Name is invalid");
   
    if(dob!= null)
	{
   dateOfBirth = dob;
   isDobValid = true;
   }
   else
	   System.out.println("last Name is invalid");
   
   if(email!= null)
   {
   mail= email;
   isEmailValid = true;
   }
   else
	   System.out.println("mail is invalid");
   
   if(password!= null)
   {
    loginPassword = password;
   isPasswordValid = true;
   }
   else
	   System.out.println("login Password is invalid");
    
	if(confirmPassword!= null)
	{
   confirm= confirmPassword;
   isConfirmPasswordValid = true;
   }
   else
	   System.out.println("confirm Password is invalid");
   
  
   if(isFirstNameValid== true && isLastNameValid==true && isDobValid== true && isEmailValid== true && isPasswordValid== true && isConfirmPasswordValid== true) 
   
   isAccountCreated = true;
   return isAccountCreated;
   }
  
  
   public static void readUserAccountDetails()
   {
	
   System.out.println("Details of user is...");
   System.out.println("The first name of the user is: "+ fstName);
   System.out.println("The sur name of user is: " + lstName);
   System.out.println("The date of birth of user is: " + dateOfBirth);
   System.out.println("The email Id of user is: " +mail);
   System.out.println("password  is: " +loginPassword);
   System.out.println("confirm Password is: "+confirm);
	   
   }
   
   
}