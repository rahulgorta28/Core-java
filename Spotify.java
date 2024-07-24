class Spotify{
	
	static String fullName;
	static String email;
	static String phone;
	static String pword;
	static String birth;
	
 public static boolean createSpotifyAccount(String name,String emailId, String phoneNumber,String pwd,String dob){
		boolean isSpotifyCreated = false;
		
		boolean isNameVaild = false;
		boolean isEmailIdValid = false;
		boolean isPhoneNumberValid = false;
		boolean isPasswordValid = false;
		boolean isdobValid = false;
		
		if( name!=null){
			fullName = name;
			isNameVaild = true;
		}
		else
			System.out.println(" Name is Invalid");
		
		if( emailId!=null){
			email = emailId;
			isEmailIdValid =true;
		}
		else
			System.out.println(" Email is Invalid");
		
		if( phoneNumber!=null){
			phone = phoneNumber;
			isPhoneNumberValid = true;
		}
		else
			System.out.println(" Phone number is Invalid");
		
		if( pwd!=null){
			pword = pwd;
			isPasswordValid = true;
		}
		else
			System.out.println(" Password is Invalid");
		
		if( dob!=null){
			birth = dob;
			isdobValid = true;
		}
		else
			System.out.println(" Birth is Invalid");
		
		if(isNameVaild == true && isEmailIdValid == true && isPhoneNumberValid == true && isPasswordValid ==true && isdobValid == true){
			isSpotifyCreated = true;
		}
	    return isSpotifyCreated;
		
	}
	
	public static void readSpotifyAccount(){
		
		System.out.println("Spotify registration");
		System.out.println("Name:"+fullName);
		System.out.println("Email Id:"+email);
		System.out.println("Phone number:"+phone);
		System.out.println("Password:"+pword);
		System.out.println("Date of birth:"+birth);
		
	}
}