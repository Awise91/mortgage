package Calculator;

public class Calculate {

	private static double interest;
	private static int payments;
	private static double income;
	private static int term;
	private static double down;
	private double debt;
	
	public static double getInterest() {
		return interest;
	}
	public static void setInterest(double interest) {
	}
	
	public static int getPayments() {
		return term*12;
	}
	public void setPayments(int payments) {
	}
	
	public static double getIncome() {
		return income;
	}
	public static void setIncome(double income) {
	}
	
	public static int getTerm() {
		return term;
	}
	public static void setTerm(int term) {
	}
	
	public static double getDown() {
		return down;
	}
	
	public static void setDown(double down) {
	}
	
	public double getDebt() {
		return debt;
	}
	public static void setDebt(double debt) {
	}
	
	static double HPO = getIncome()*0.18;
	static double HP = getIncome()*0.36;
	
	public static double maxPayment() {
		if (HPO > HP) {
			return HPO;
		}
		else {
			return HP;
		}
	}
	
	public static double mortgage() {
		return (getIncome()/(1 + Math.pow(getInterest(), getPayments()))-getDown());
	}
}

