package Payslip;

public class Payslip {
	
	public String name;
    public String payPeriod;
    public Double grossIncome;
    public Double incomeTax;
    public Double netIncome;
    public Double superann;
    
    public Payslip(String name, String payPeriod, Double grossIncome, Double incomeTax, Double netIncome,
            Double superann)
        {
            this.name = name;
            this.payPeriod = payPeriod;
            this.grossIncome = grossIncome;
            this.incomeTax = incomeTax;
            this.netIncome = netIncome;
            this.superann = superann;
        }

}
