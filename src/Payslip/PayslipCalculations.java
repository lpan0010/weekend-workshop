package Payslip;

import java.util.Map;
import static java.util.Map.entry;

public class PayslipCalculations {
	private static final Integer NUMBER_OF_MONTHS = 12;
    
    public static Double CalculateGrossIncome(Double salary)
    {
        return Math.floor(salary / NUMBER_OF_MONTHS);
    }

    public static Double CalculateIncomeTax(Double salary)
    {
        Map<Double[], Double[]> incomeRates = Map.ofEntries
        (
            entry(new Double[] {180001.0, Double.POSITIVE_INFINITY}, new Double[] {54232.0,0.45, 180000.0}),
            entry(new Double[] {87001.0, 180000.0}, new Double[] {19822.0,0.37, 87000.0}),
            entry(new Double[] {37001.0, 87000.0}, new Double[] {3572.0,0.325, 37000.0}),
            entry(new Double[] {18209.0, 37000.0}, new Double[] {0.0,0.19, 18200.0}),
            entry(new Double[] {0.0, 18200.0}, new Double[] {0.0,0.0, 0.0})
        );

        Double incomeTaxForYear = 0.0;
        for (Map.Entry<Double[], Double[]> taxBracket : incomeRates.entrySet())
        {
            if (salary >= taxBracket.getKey()[0] && salary <= taxBracket.getKey()[1])
            {
                incomeTaxForYear += taxBracket.getValue()[0] + ((salary - taxBracket.getValue()[2]) * taxBracket.getValue()[1]);
                salary = taxBracket.getValue()[2];
            }
        }

        return Math.ceil(incomeTaxForYear/NUMBER_OF_MONTHS);
    }

    public static Double CalculateNetIncome(double grossIncome, double incomeTax)
    {
        return grossIncome - incomeTax;
    }

    public static Double CalculateSuper(double superRate, double salary)
    {
        return Math.floor((salary * superRate) / NUMBER_OF_MONTHS);
    }

}
