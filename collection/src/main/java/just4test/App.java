package just4test;

import just4test.pojo.Employee;
import just4test.pojo.Person;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee a = new Employee("chenxiang",1990.6);
		Employee b = a.clone();
		b.setHireDay(1990, 12, 12);
		b.raiseSalary(10);
		System.out.println(a);
		System.out.println(b);
		Person p = new Person(12,"chenxiang","male");
	}

}
