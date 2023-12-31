package sessionPrototype.bean;

import sessionPrototype.service.RegistrationService;
import sessionPrototype.service.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.LinkedHashMap;
import java.util.Map;

public class UserRegistrationBeanImpl implements UserRegistrationBean {
	@Autowired
	private RegistrationService registrationService;
	@Autowired
	private UserRegistrationValidator validator;
	private UserInfo userInfo;

	@Override
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	@Override
	public Map<String, String> validate() {
		if (userInfo == null) {
			throw new RuntimeException("UserInfo must be set before calling validate method");
		}
		Map<String, String> errors = new LinkedHashMap<>();
		String errorMessage = validator.validateEmail(userInfo.getEmail());
		if (errorMessage != null) {
			errors.put(KEY_EMAIL, errorMessage);
		}
		errorMessage = validator.validatePassword(userInfo.getPassword());
		if (errorMessage != null) {
			errors.put(KEY_PASSWORD, errorMessage);
		}
		return errors;
	}

	@Override
	public void register() {
		registrationService.register(userInfo);
	}
}
