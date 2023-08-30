package Day2.Questions.Ques2;

import Day2.E2ChildInterface;
import Day2.E2ParentInterface;


public class E2ChildClass implements E2ChildInterface,E2ParentInterface {
	  public void ChildMethod() {
		    System.out.println("This is child class");
		  }
		  public void ParentMethod() {
			    System.out.println("This is parent class");
		  }

}
