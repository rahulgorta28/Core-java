class BankRunner{

	public static void main(String[] BankDetails){
	
	Bank ref1 = new Bank();
	ref1.bankId = 1;
	ref1.ifscCode = "CNRB1234";
	ref1.swiftCode = "CNRB8923";
	ref1.bankName = "Canara Bank";
	ref1.noOfWorkers = 10;
	ref1.branchName = "Mrmc super market branch";
	ref1.displayDetails();
	
	Bank ref2 = new Bank();
	ref2.bankId = 2;
	ref2.ifscCode = "CNRB1234";
	ref2.swiftCode = "CNRB8923";
	ref2.bankName = "Canara Bank";
	ref2.noOfWorkers = 15;
	ref2.branchName = "cubbon road branch";
	ref2.displayDetails();
	
	Bank ref3 = new Bank();
	ref3.bankId = 3;
	ref3.ifscCode = "UNIB8904";
	ref3.swiftCode = "UNIB7223";
	ref3.bankName = "Union Bank";
	ref3.noOfWorkers = 20;
	ref3.branchName = "KR market branch";
	ref3.displayDetails();
	
	Bank ref4 = new Bank();
	ref4.bankId = 4;
	ref4.ifscCode = "UNIB1234";
	ref4.swiftCode = "UNIB8923";
	ref4.bankName = "Union Bank";
	ref4.noOfWorkers = 19;
	ref4.branchName = "Anand rao circle branch";
	ref4.displayDetails();
	
	Bank ref5 = new Bank();
	ref5.bankId = 5;
	ref5.ifscCode = "SBOI8902";
	ref5.swiftCode = "SBOI3340";
	ref5.bankName = "State Bank Of India";
	ref5.noOfWorkers = 20;
	ref5.branchName = "MG road branch";
	ref5.displayDetails();
	
	Bank ref6 = new Bank();
	ref6.bankId = 6;
	ref6.ifscCode = "SBOI8902";
	ref6.swiftCode = "SBOI4561";
	ref6.bankName = "State Bank Of India";
	ref6.noOfWorkers = 30;
	ref6.branchName = "Mysore road branch";
	ref6.displayDetails();
	
	Bank ref7 = new Bank();
	ref7.bankId = 7;
	ref7.ifscCode = "SBOI8902";
	ref7.swiftCode = "SBOI4561";
	ref7.bankName = "State Bank Of India";
	ref7.noOfWorkers = 30;
	ref7.branchName = "Mysore road branch";
	ref7.displayDetails();
	
	Bank ref8 = new Bank();
	ref8.bankId = 8;
	ref8.ifscCode = "SBOM8902";
	ref8.swiftCode = "SBOM4561";
	ref8.bankName = "State Bank Of Mysore";
	ref8.noOfWorkers = 23;
	ref8.branchName = "Mysore road branch";
	ref8.displayDetails();
	
	}

}