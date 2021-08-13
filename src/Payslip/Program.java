package Payslip;

import java.io.IOException;

public class Program {

	public static void main(String[] args)  throws IOException {
		var numberOfPayslipsPrinted = 0;
		
		
		while(numberOfPayslipsPrinted < 3) {
			var consoleInput = new ConsoleInput();
			var employee = consoleInput.GetEmployeeDetails();
			employee.Work();
			var payslip = new PayslipGenerator().CreatePayslip(employee);
			var consoleOutput = new ConsoleOutput();
			consoleOutput.Display(payslip);
			numberOfPayslipsPrinted++;
		}
		
	}

}


