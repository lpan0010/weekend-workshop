package Payslip;

public class ConsoleOutput {
	public void Display(Payslip payslip)
    {
        System.out.println("\nYour payslip has been generated:");

        System.out.println("Name: "+ payslip.name + "\n" +
                           "Pay Period: "+ payslip.payPeriod + "\n" +
                           "Gross Income: " + payslip.grossIncome + "\n" +
                           "Income Tax: " + payslip.incomeTax + "\n" +
                           "Net Income: " + payslip.netIncome + "\n" +
                           "Super: " + payslip.superann + "\n");
        
        System.out.println("Thank you for using MYOB!");
        System.out.println("-----------------------------------");
    }

}
