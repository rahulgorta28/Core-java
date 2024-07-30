class Bill{

	int billReferenceId;
	int billSequenceNo;
	String billIssueDate;
	String billDueDate;
	boolean isBillPaid;
	boolean isBillLatest;
	boolean isFinalBill;
	boolean taxInclusiveBill;
	double billAmt;
	
	public void displayDetails(){
		System.out.println("Display method started");
		System.out.println(billReferenceId);
		System.out.println(billSequenceNo);
		System.out.println(billIssueDate);
		System.out.println(billDueDate);
		System.out.println(isBillPaid);
		System.out.println(isBillLatest);
		System.out.println(isFinalBill);
		System.out.println(taxInclusiveBill);
		System.out.println(billAmt);
		
	}
	

}