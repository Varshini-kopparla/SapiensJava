package sessionPrototype;

import sessionPrototype.bean.UserRegistrationBean;
import sessionPrototype.service.UserInfo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.Scanner;

public class AppMain {
	private final PrintStream printStream;
	private Scanner scanner;

	public AppMain(InputStream inputStream, PrintStream printStream) {
		this.scanner = new Scanner(inputStream);
		this.printStream = printStream;
	}

	public static void main(String[] args) {
		AppMain appMain = new AppMain(System.in, System.out);
		appMain.start();
	}

	public void start() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		UserRegistrationBean registrationBean = context.getBean(UserRegistrationBean.class);
		while (true) {
			printStream.println("UserRegistrationBean, instance: " + System.identityHashCode(registrationBean));
			printStream.println("Enter new user. Enter exit to terminate");
			boolean exit = registerUser(registrationBean);
			if (exit) {
				break;
			}
			registrationBean = context.getBean(UserRegistrationBean.class);
		}
	}

	private boolean registerUser(UserRegistrationBean registrationBean) {
		UserInfo userInfo = new UserInfo();
		registrationBean.setUserInfo(userInfo);
		Map<String, String> errors = null;
		while (errors == null || errors.size() > 0) {
			if (errors != null) {
				printStream.println("Errors : " + errors.values() + "\n");
				printStream.println("Please enter exit to terminate");
			}
			if (errors == null || errors.containsKey(UserRegistrationBean.KEY_EMAIL)) {
				String email = getUserInput("Enter Email");
				if (email == null) {
					return true;
				}
				userInfo.setEmail(email);
			}
			if (errors == null || errors.containsKey(UserRegistrationBean.KEY_PASSWORD)) {
				String password = getUserInput("Enter Password");
				if (password == null) {
					return true;
				}
				userInfo.setPassword(password);
			}
			errors = registrationBean.validate();
		}
		registrationBean.register();
		printStream.println("User has been registered successfully: " + userInfo);
		return false;
	}

	public String getUserInput(String instruction) {
		printStream.print(instruction + ">");
		String s = scanner.nextLine();
		if ("exit".equals(s)) {
			return null;
		}
		return s;
	}
}