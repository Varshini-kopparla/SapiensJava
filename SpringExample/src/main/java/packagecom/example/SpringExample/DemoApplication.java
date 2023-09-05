/*
Create a project with a name SpringExample and a package packagecom.example. These 
should be under src folder of the created project.
Add the needed Spring libraries using Add External JARs.
Create Java classes HelloWorld and MainApp under the package package com.example.
Create Beans config file Beans.xml under src folder.
At last, create content of all Java files and Beans configuration file and run the file
*/

package packagecom.example.SpringExample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


@SuppressWarnings("unused")
@SpringBootApplication
public class DemoApplication {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Spring Demo");
		//XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beans.xml"));
		ApplicationContext factory = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
		System.out.println(obj.getName() + " " + obj.getMessage());
		
		System.out.println("Spring ApplicationContext Container");
		System.out.println("FileSystemXmlApplicationContext");
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\varshini.kopparla\\Downloads\\SpringExample\\src\\main\\resources\\Beans.xml");
		HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
		System.out.println(obj1.getName()+ " "+ obj1.getMessage());
		System.out.println("ClassPathXmlApplicationContext");
		ApplicationContext context1 = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
		System.out.println(obj2.getName()+ " "+ obj2.getMessage());
	}

}
