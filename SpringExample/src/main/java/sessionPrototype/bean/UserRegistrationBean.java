package sessionPrototype.bean;

import java.util.Map;
import sessionPrototype.service.UserInfo;

public interface UserRegistrationBean {
	public static String KEY_EMAIL = "email";
	public static String KEY_PASSWORD = "password";

	void setUserInfo(UserInfo userInfo);

	Map<String, String> validate();

	void register();
}
