package singleBean;

import org.springframework.beans.factory.annotation.Autowired;

public class ClientBean1 {
	@Autowired
	private ServiceBean serviceBean;

	public void doSomething() {
		System.out.println("from ClientBean1: serviceBean: " + System.identityHashCode(serviceBean));
	}
}