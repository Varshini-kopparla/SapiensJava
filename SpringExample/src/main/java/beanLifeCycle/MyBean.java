package beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyBean implements InitializingBean, DisposableBean {
	private OtherBean otherBean;

	public MyBean() {
		System.out.println("MyBean constructor");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("myPostConstruct()");
	}

	public void doSomething() {
		System.out.println("doSomething()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("cleanUp method");
	}
}
