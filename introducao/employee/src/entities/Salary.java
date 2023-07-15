package entities;

public class Salary {
	public String name;
	public double grossSalary, tax;

	public double netSalary()
	{
		return grossSalary - tax;
	}

	public void increaseSalary(double increase) 
	{
		grossSalary = grossSalary * (1 + (increase/100));
	}
	public String toString() {
		return name +  ", $ " + String.format("%.2f", netSalary());
	}
}
