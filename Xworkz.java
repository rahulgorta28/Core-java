class Xworkz{

   static String first;
   static String last;
   static String mail;
   static String dob;
   static String cgpa;
   static String branch;
   static String sslcper;
   static String pucper;
   
   
  public static boolean createTraineeRegistration( String firstName, String lastName,String email, String dateOfBirth, String bepercentage , String stream, String sslc, String puc) {
 
   boolean isRegistrationDone = false;
   
   boolean isFirstNameValid = false;
   boolean isLastNameValid = false;   
   boolean isMailidValid = false;
   boolean isDateOfBirthValid = false;
   boolean isBePercentageValid = false;
   boolean isBranchValid = false;
   boolean isSslcPerValid = false;
   boolean isPucPerValid = false;
  
  if(firstName!= null){
   first = firstName;
   isFirstNameValid = true;
   }
   else
	   System.out.println("firstName is invalid");
   
    if(lastName!= null){
   last = lastName;
   isLastNameValid = true;
   }
   else
	   System.out.println("lastName is invalid");
   
   
    if(email!= null){
   mail = email;
    isMailidValid= true;
   }
   else
	   System.out.println("email is invalid");
   
   
    if(dateOfBirth!= null){
    dob = dateOfBirth;
   isDateOfBirthValid = true;
   }
   else
	   System.out.println("dateOfBirth is invalid");
	   
	 
	if(bepercentage!= null){
    cgpa = bepercentage;
    isBePercentageValid= true;
   }
   else
	   System.out.println("percentage is invalid");
   
   
   
    if(stream!= null){
    branch = stream;
   isBranchValid = true;
   }
   else
	   System.out.println("branch is invalid");
   
   
    if(sslc!= null){
    sslcper = sslc;
   isSslcPerValid = true;
   }
   else
	   System.out.println("sslc percentage is invalid");
	   
	 
    if(puc!= null){
    pucper = puc;
   isPucPerValid = true;
   }
   else
	   System.out.println("pu percentage is invalid");   
   
 
      if (isFirstNameValid==true && isLastNameValid==true && isMailidValid==true && isDateOfBirthValid==true && isBePercentageValid==true && isBranchValid==true && isSslcPerValid==true && isPucPerValid==true) {
 


   isRegistrationDone = true;
   return isRegistrationDone;
   }
  
   public static void readTraineeRegistration(){
   
   System.out.println("firstName is: "+first);
   System.out.println("The lastName user is: " + last);
   System.out.println("The mailid is: " + mail);
   System.out.println("The date of birth user is: " +dob);
   System.out.println("cgpa is: " +cgpa);
   System.out.println("branch is: "+branch);
   System.out.println("sslc percentage is: " +sslcper);
   System.out.println("puc percentage is: "+pucper);
	   
   }
   
   
}