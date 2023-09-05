package singleBean;

import org.springframework.beans.factory.annotation.Autowired;

public class ClientBean2 {
	@Autowired
	private ServiceBean serviceBean;

	public void doSomething() {
		System.out.println("from ClientBean2: serviceBean: " + System.identityHashCode(serviceBean));
	}
}