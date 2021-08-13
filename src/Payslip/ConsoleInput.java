package Payslip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {

	public Employee GetEmployeeDetails()  throws IOException
    {
		System.out.println("-----------------------------------");
		
		BufferedReader my_reader = new BufferedReader(new InputStreamReader(System.in));
		
        System.out.print("Please input your name: ");
        var name = my_reader.readLine();
        System.out.print("Please input your surname: ");
        var surname = my_reader.readLine();
        System.out.print("Please enter your annual salary: ");
        var salary = Double.parseDouble(my_reader.readLine());
        System.out.print("Please enter your super rate: ");
        var superRate = Double.parseDouble(my_reader.readLine());
        System.out.print("Please enter your payment month: ");
        var month = my_reader.readLine();

        return new Developer(name, surname, salary, superRate, month);
//        return new Accountant(name, surname, salary, superRate, month); -- this 
    }

}
