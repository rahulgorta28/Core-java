class LinkedIn {
	
	static String first;
	static String last;
    static String email;
    static String pword;
    static String confirm;
    static String nation;
    static String loct;
    static String comp;
    static String role;
    static String ind;
    static String edu;
	static String year;

    public static boolean createLinkedlnAccount(String firstName, String lastName,String emailId, String pwd,String confirmPwd,String country,String location, String company, String title, String industry,String education, String yearOfaPass){
	boolean isLinkedlnCreated = false;
	
	boolean isFirstNameValid = false;
	boolean isLastNameValid = false;
	boolean isEmailidValid = false;
	boolean isPasswordValid = false;
	boolean isConformPasswordValid = false;
	boolean isCountryValid = false;
	boolean isLoctionValid = false;
    boolean isCompanyValid = false;
	boolean isRoleValid = false;
	boolean isIndustryValid = false;
	boolean isEducationValid = false;
	boolean isYearofPassValid = false;
 	
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
	   
	if(emailId!= null){
   email = emailId;
   isEmailidValid = true;
   }
   else
	   System.out.println("email is invalid");

   if(pwd!= null){
   pword = pwd;
   isPasswordValid = true;
   }
   else
	   System.out.println("password is invalid");	   
	   
	
   if(confirmPwd!= null){
   confirm = confirmPwd;
   isConformPasswordValid = true;
   }
   else
	   System.out.println("confirmPwd is invalid");
	   
	
   if(country!= null){
	nation = country;
    isCountryValid= true;
   }
   else
	   System.out.println("country is invalid");

    
   if(location!= null){
   	loct = location;
    isLoctionValid= true;
   }
   else
	   System.out.println(" location is invalid");

    
   if(company!= null){
   	comp = company;
   isCompanyValid= true;
   }
   else
	   System.out.println("company is invalid");
  
  
   if(title!= null){
   	role = title;
  isRoleValid = true;
   }
   else
	   System.out.println("role is invalid");
  
  
   if(industry!= null){
   	ind = industry;
   isIndustryValid= true;
   }
   else
	   System.out.println("industry is invalid");
  
  
   if(education!= null){
	edu = education;
   isEducationValid= true;
   }
   else
	   System.out.println("education is invalid");	


   if(yearOfaPass!= null){
   year = yearOfaPass;
   isYearofPassValid= true;
   }
   else
	   System.out.println("yearOfaPass is invalid");	   
	
	if (isFirstNameValid == true && isLastNameValid == true &&  isEmailidValid == true && isPasswordValid == true && isConformPasswordValid == true && isCountryValid == true && isLoctionValid == true &&  isCompanyValid == true &&  isRoleValid == true &&  isIndustryValid == true &&  isEducationValid == true)
	isLinkedlnCreated = true;
	return isLinkedlnCreated;
}
    
	public static void readLinkedlnAccount(){
		
		System.out.println("First Name:"+first);
		System.out.println("Last Name:"+last);
		System.out.println("email Id:"+email);
		System.out.println("Password:"+pword);
		System.out.println("Confirm Password:"+confirm);
		System.out.println("Country:"+nation);
		System.out.println("location:"+loct);
		System.out.println("Company:"+comp);
		System.out.println("Title:"+role);
		System.out.println("Industry:"+ind);
		System.out.println("Education:"+edu);
		System.out.println("yearOfaPass:"+year);
		
	}
}