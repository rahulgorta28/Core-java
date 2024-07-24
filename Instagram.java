class Instagram{

   
   static String mail;
   static String name;
   static String dob;
   static String pass;
   static String confirm;
   
   
  public static boolean createUserAccount( String email, String userName, String dateOfBirth, String password, String confirmPassword) {
 
   boolean isAccountCreated = false;
   
   boolean isMailidValid = false;
   boolean isUserNameValid = false;
   boolean isDateOfBirthValid = false;
   boolean isPasswordValid = false;
   boolean isConfirmPasswordValid = false;
  
   
    if(email!= null){
   mail = email;
   isMailidValid = true;
   }
   else
	   System.out.println("email is invalid");
   
   
    if(userName!= null){
   name = userName;
   isUserNameValid = true;
   }
   else
	   System.out.println("user Name is invalid");
   
   
    if(dateOfBirth!= null){
    dob = dateOfBirth;
   isDateOfBirthValid = true;
   }
   else
	   System.out.println("dateOfBirth is invalid");
   
   
    if(password!= null){
    pass = password;
   isPasswordValid = true;
   }
   else
	   System.out.println("password is invalid");
   
   
    if(confirmPassword!= null){
    confirm = confirmPassword;
   isConfirmPasswordValid = true;
   }
   else
	   System.out.println("comform password is invalid");
   
 
   
   if (isMailidValid==true && isUserNameValid==true && isDateOfBirthValid==true && isPasswordValid==true && isConfirmPasswordValid==true) 
    

   isAccountCreated = true;
   return isAccountCreated;
   }
  
   public static void readUserAccountDetails(){
	
   System.out.println("Details of user is...");
   System.out.println("The email id of user is: " + mail);
   System.out.println("The user name is: " + name);
   System.out.println("The date of birth user is: " +dob);
   System.out.println("password is: " +pass);
   System.out.println("confirm Password is: "+confirm);
	   
   }
   
   
}