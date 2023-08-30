package Day2.Questions.Ques4;

import Day2.E4BasicAnimal;

public class E4Human extends E4Monkey implements E4BasicAnimal {
    public void eat() {
        System.out.println("Human is eating");
    }
    
    public void sleep() {
        System.out.println("Human is sleeping");
    }

}
