package sree;
import java.util.Comparator;

import lambdas.employee.Employee;

public class EmployeeSorterUsual {
	
	
	
	public static Comparator<Employee> compareByName = new Comparator<>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
			
		}
		
	};
	
	//compare using last digit
	public static Comparator<Integer> compareByLastDigit = new Comparator<>() {

		@Override
		public int compare(Integer e1, Integer e2) {
			
			int lastDigit1 = e1%10;
			int lastDigit2 = e2%10;
			
			return Integer.compare(lastDigit1, lastDigit2);
			
		}
		
	};

}
