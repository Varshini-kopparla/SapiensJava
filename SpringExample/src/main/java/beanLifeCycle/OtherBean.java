package beanLifeCycle;

public class OtherBean {
	private String message;

	// constructor
	public OtherBean(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "OtherBean{" + "message='" + message + '\'' + '}';
	}
}
