class BillRunner{

	public static void main(String[] args){
	
		Bill ref = new Bill();
		
		ref.billReferenceId = 657342;
		ref.billSequenceNo = 1;
		ref.billIssueDate = "28-02-23";
		ref.billDueDate = "10-03-23";
		ref.isBillPaid = true;
		ref.isBillLatest = true;
		ref.isFinalBill = true;
		ref.taxInclusiveBill = true;
		ref.billAmt = 234.87;    
	
		ref.displayDetails();
			
		Bill ref1 = new Bill();
		
		ref1.billReferenceId = 901686;
		ref1.billSequenceNo = 2;
		ref1.billIssueDate = "16-03-23";
		ref1.billDueDate = "05-03-23";
		ref1.isBillPaid = true;
		ref1.isBillLatest = true;
		ref1.isFinalBill = true;
		ref1.taxInclusiveBill = true;
		ref1.billAmt = 746.96;    
	
		ref1.displayDetails();
		
		
		
		
		Bill ref2 = new Bill();
		
		ref2.billReferenceId = 891963;
		ref2.billSequenceNo = 3;
		ref2.billIssueDate = "23-01-23";
		ref2.billDueDate = "07-01-23";
		ref2.isBillPaid = true;
		ref2.isBillLatest = true;
		ref2.isFinalBill = true;
		ref2.taxInclusiveBill = true;
		ref2.billAmt = 341.21;    
	
		ref2.displayDetails();
		
					Bill ref3 = new Bill();
		
		ref3.billReferenceId = 129012;
		ref3.billSequenceNo = 4;
		ref3.billIssueDate = "11-08-23";
		ref3.billDueDate = "30-08-23";
		ref3.isBillPaid = false;
		ref3.isBillLatest = false;
		ref3.isFinalBill = false;
		ref3.taxInclusiveBill = false;
		ref3.billAmt = 678.32;    
	
		ref3.displayDetails();
		
					Bill ref4 = new Bill();
		
		ref4.billReferenceId = 654126;
		ref4.billSequenceNo = 5;
		ref4.billIssueDate = "17-05-23";
		ref4.billDueDate = "02-05-23";
		ref4.isBillPaid = true;
		ref4.isBillLatest = false;
		ref4.isFinalBill = false;
		ref4.taxInclusiveBill = true;
		ref4.billAmt = 963.78;    
	
		ref4.displayDetails();
		
					Bill ref5 = new Bill();
		
		ref5.billReferenceId = 258963;
		ref5.billSequenceNo = 6;
		ref5.billIssueDate = "27-09-23";
		ref5.billDueDate = "17-09-23";
		ref5.isBillPaid = false;
		ref5.isBillLatest = true;
		ref5.isFinalBill = true;
		ref5.taxInclusiveBill = false;
		ref5.billAmt = 345.87;    
	
		ref5.displayDetails();
		
					Bill ref6 = new Bill();
		
		ref6.billReferenceId = 412652;
		ref6.billSequenceNo = 7;
		ref6.billIssueDate = "11-04-23";
		ref6.billDueDate = "30-04-23";
		ref6.isBillPaid = true;
		ref6.isBillLatest = true;
		ref6.isFinalBill = false;
		ref6.taxInclusiveBill = false;
		ref6.billAmt = 789.87;    
	
		ref6.displayDetails();
		
					Bill ref7 = new Bill();
		
		ref7.billReferenceId = 365412;
		ref7.billSequenceNo = 8;
		ref7.billIssueDate = "05-03-23";
		ref7.billDueDate = "25-03-23";
		ref7.isBillPaid = false;
		ref7.isBillLatest = false;
		ref7.isFinalBill = true;
		ref7.taxInclusiveBill = true;
		ref7.billAmt = 465.56;    
	
		ref7.displayDetails();
		
					Bill ref8 = new Bill();
		
		ref8.billReferenceId = 951452;
		ref8.billSequenceNo = 9;
		ref8.billIssueDate = "23-12-23";
		ref8.billDueDate = "03-01-24";
		ref8.isBillPaid = false;
		ref8.isBillLatest = true;
		ref8.isFinalBill = false;
		ref8.taxInclusiveBill = true;
		ref8.billAmt = 369.54;    
	
		ref8.displayDetails();
		
					Bill ref9 = new Bill();
		
		ref9.billReferenceId = 890743;
		ref9.billSequenceNo = 10;
		ref9.billIssueDate = "28-02-24";
		ref9.billDueDate = "02-03-24";
		ref9.isBillPaid = true;
		ref9.isBillLatest = false;
		ref9.isFinalBill = true;
		ref9.taxInclusiveBill = false;
		ref9.billAmt = 324.99;    
	
		ref9.displayDetails();
	}
}