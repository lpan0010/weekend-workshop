package Payslip;

import java.util.Map;
import static java.util.Map.entry;


public class PayslipGenerator {
	
	public Payslip CreatePayslip(Employee employee)
    {
        var name = employee.name + " " + employee.surname;
        var payPeriod = GetPayPeriod(employee.month);
        var grossIncome = PayslipCalculations.CalculateGrossIncome(employee.salary);
        var incomeTax = PayslipCalculations.CalculateIncomeTax(employee.salary);
        var netIncome = PayslipCalculations.CalculateNetIncome(grossIncome, incomeTax);
        var superann = PayslipCalculations.CalculateSuper(employee.superRate, employee.salary);
        
        return new Payslip
        (
            name,
            payPeriod,
            grossIncome,
            incomeTax,
            netIncome,
            superann
        );
        
    }

    private String GetPayPeriod(String month)
    {
    	Map<String, Integer> months = Map.ofEntries
        (
            entry("January", 31),
            entry("February", 28),
            entry("March", 31),
            entry("April", 30),
            entry("May", 31),
            entry("June", 30),
            entry("July", 31),
            entry("August", 31),
            entry("September", 30),
            entry("October", 31),
            entry("November", 30),
            entry("December", 31)
        );

        return "01 " + month + " - " + months.get(month) + " " + month;
    }

}
