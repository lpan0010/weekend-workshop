package Payslip;

import java.io.IOException;

public class Program {

	public static void main(String[] args)  throws IOException {
		
		var consoleInput = new ConsoleInput();
		var employee = consoleInput.GetEmployeeDetails();
		var payslip = new PayslipGenerator().CreatePayslip(employee);
		var consoleOutput = new ConsoleOutput();
		consoleOutput.Display(payslip);
		
	}

}


