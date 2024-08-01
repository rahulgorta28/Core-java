class SocialMedia{

    int socialMediaId;
	String emailId;
	String socialMediaName;
	String profileName;
	
	public SocialMedia(int socialMediaId,String emailId,String socialMediaName,String profileName){
		
		this.socialMediaId = socialMediaId;
		this.emailId = emailId;
		this.socialMediaName = socialMediaName;
		this.profileName = profileName;
	}
	
	public void displayDetails(){
		System.out.println("Display method started");
		System.out.println("The Social Media Id is:" + socialMediaId);
		System.out.println("The Social Media email Id is:" + emailId);
		System.out.println("The Social Media name is:" + socialMediaName);
		System.out.println("The Social Media profile name is:" + profileName);
		
		
	}
	

}