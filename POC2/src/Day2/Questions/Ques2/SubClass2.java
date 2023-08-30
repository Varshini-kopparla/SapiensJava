package Day2.Questions.Ques2;

import Day2.E2ChildClass;
import Day2.E2ParentClass;


public class SubClass2 {
	
private int choice2;
	
	public SubClass2(int choice2) {
		this.choice2=choice2;
	}
	
	public void start() {
		switch(choice2) {
		case 1:
			E2ParentClass p = new E2ParentClass();
			p.ParentMethod();
			break;
		case 2:
			E2ChildClass c = new E2ChildClass();
			c.ChildMethod();
			c.ParentMethod();
			break;
		}
		
	}

}
