package Payslip;

public class Accountant extends Employee{

	public Accountant(String name, String surname, Double salary, Double superRate, String month) {
		super(name, surname, salary, superRate, month);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println("I do the accounting!");
	}

}
