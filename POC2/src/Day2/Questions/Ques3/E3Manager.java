package Day2.Questions.Ques3;

import Day2.E3Member;

class E3Manager extends E3Member {
    String department;
    
    E3Manager(String name,int age,String phoneNumber,String address,int salary,String department) {
    	this.name = name;
    	this.age = age;
    	this.phoneNumber = phoneNumber;
    	this.address = address;
    	this.salary = salary;
    	this.department = department;
    }
    
    public void getManagerDetails() {
    	System.out.println("Manager:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Department: " + department);
    }
}
