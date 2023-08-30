package Day2.Questions.Ques3;

import Day2.E3Member;

class E3Employee extends E3Member {
    String specialization;
    
    E3Employee(String name,int age,String phoneNumber,String address,int salary,String specialization) {
    	this.name = name;
    	this.age = age;
    	this.phoneNumber = phoneNumber;
    	this.address = address;
    	this.salary = salary;
    	this.specialization = specialization;
    }
    
    public void getEmployeeDetails() {
    	System.out.println("Employee:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Specialization: " + specialization);
    }
    
}
