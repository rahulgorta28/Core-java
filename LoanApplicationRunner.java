class LoanApplicationRunner{

    public static void main(String[]loan){
		
		
		boolean isLoanApplied=LoanApplication.createLoanAccount(null,"Personal","shivani","State Bank of Mysore","10.6","10 years");
		if(isLoanApplied == true)
		LoanApplication.readLoanAccount();
		
	}
}