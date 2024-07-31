class DebitCard{

	int cardId;
	long cardNo;
	String cardHolderName;
	String expiryDate;
	int cvvNo;
	
	public void displayDetails(){
		System.out.println("Display method started");
		System.out.println("The Debit card Id is:" + cardId);
		System.out.println("The Debit card No. is:" + cardNo);
		System.out.println("The Debit card holder name is:" + cardHolderName);
		System.out.println("The Debit card expire on:" + expiryDate);
		System.out.println("The Debit card cvv No is:" + cvvNo);
		
		
	}
	

}