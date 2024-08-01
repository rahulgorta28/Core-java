class BankRunner{

	public static void main(String[] BankDetails){
	
	Bank ref1 = new Bank(1,"CNRB1234","CNRB8923","Canara Bank",10,"Mrmc super market branch");
/*
	ref1.bankId = 1;
	ref1.ifscCode = "CNRB1234";
	ref1.swiftCode = "CNRB8923";
	ref1.bankName = "Canara Bank";
	ref1.noOfWorkers = 10;
	ref1.branchName = "Mrmc super market branch";
*/	
	ref1.displayDetails();
	
	Bank ref2 = new Bank(2,"CNRB1234","CNRB8923","Canara Bank",15,"cubbon road branch");
/*
	ref2.bankId = 2;
	ref2.ifscCode = "CNRB1234";
	ref2.swiftCode = "CNRB8923";
	ref2.bankName = "Canara Bank";
	ref2.noOfWorkers = 15;
	ref2.branchName = "cubbon road branch";
*/	
	ref2.displayDetails();
	
	Bank ref3 = new Bank(3,"UNIB1234","UNIB8923","Union Bank",20,"KR market branch");
/*	
	ref3.bankId = 3;
	ref3.ifscCode = "UNIB8904";
	ref3.swiftCode = "UNIB7223";
	ref3.bankName = "Union Bank";
	ref3.noOfWorkers = 20;
	ref3.branchName = "KR market branch";
*/	
	ref3.displayDetails();
	
	Bank ref4 = new Bank(4,"UNIB1234","UNIB8923","Union Bank",19,"Anand rao circle branch");
/*	
	ref4.bankId = 4;
	ref4.ifscCode = "UNIB1234";
	ref4.swiftCode = "UNIB8923";
	ref4.bankName = "Union Bank";
	ref4.noOfWorkers = 19;
	ref4.branchName = "Anand rao circle branch";
*/	
	ref4.displayDetails();
	
	Bank ref5 = new Bank(5,"SBOI1234","SBOI8923","State Bank of India",20,"MG road branch");
/*	
	ref5.bankId = 5;
	ref5.ifscCode = "SBOI8902";
	ref5.swiftCode = "SBOI3340";
	ref5.bankName = "State Bank Of India";
	ref5.noOfWorkers = 20;
	ref5.branchName = "MG road branch";
*/
	ref5.displayDetails();
	
	Bank ref6 = new Bank(6,"SBOI1234","SBOI8923","State Bank of India",30,"Mysore road branch");
/*	
	ref6.bankId = 6;
	ref6.ifscCode = "SBOI8902";
	ref6.swiftCode = "SBOI4561";
	ref6.bankName = "State Bank Of India";
	ref6.noOfWorkers = 30;
	ref6.branchName = "Mysore road branch";
*/	
	ref6.displayDetails();
	
	Bank ref7 = new Bank(7,"CNRB1234","CNRB8923","Canara Bank",30,"Mrmc super market branch");
/*	
	ref7.bankId = 7;
	ref7.ifscCode = "SBOI8902";
	ref7.swiftCode = "SBOI4561";
	ref7.bankName = "State Bank Of India";
	ref7.noOfWorkers = 30;
	ref7.branchName = "Mysore road branch";
*/	
	ref7.displayDetails();
	
	Bank ref8 = new Bank(8,"CNRB1234","CNRB8923","Canara Bank",23,"Mysore road branch");
/*
	ref8.bankId = 8;
	ref8.ifscCode = "SBOM8902";
	ref8.swiftCode = "SBOM4561";
	ref8.bankName = "State Bank Of Mysore";
	ref8.noOfWorkers = 23;
	ref8.branchName = "Mysore road branch";
*/
	ref8.displayDetails();
	
	}

}