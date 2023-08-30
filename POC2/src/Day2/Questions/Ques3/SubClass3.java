package Day2.Questions.Ques3;

import Day2.E3Employee;
import Day2.E3Manager;


public class SubClass3 {
	private int choice3;
	
	public SubClass3(int choice3) {
		this.choice3=choice3;
	}
	public void start() {
		switch(choice3) {
		case 1:
			E3Employee em = new E3Employee("Varshini",21,"9829499302","Hyderabad",50000,"Developer");
			em.getEmployeeDetails();
			break;
		case 2:
			E3Manager m = new E3Manager("Atul",35,"9283478723","Banglore",80000,"L&P");
			m.getManagerDetails();
			break;
		}
	}

}

