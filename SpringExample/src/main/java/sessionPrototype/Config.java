package sessionPrototype;

import sessionPrototype.bean.UserRegistrationBean;
import sessionPrototype.bean.UserRegistrationBeanImpl;
import sessionPrototype.bean.UserRegistrationValidator;
import sessionPrototype.service.RegistrationService;
import sessionPrototype.service.RegistrationServiceImpl;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	@Bean
	public UserRegistrationValidator validator() {
		return new UserRegistrationValidator();
	}

	@Bean
	public RegistrationService registrationService() {
		return new RegistrationServiceImpl();
	}

	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Bean
	public UserRegistrationBean userRegistrationBean() {
		return new UserRegistrationBeanImpl();
	}
}