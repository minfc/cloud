

package com.example.dubbo.runner;

import com.example.dubbo.entity.User;
import com.example.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Dubbo Spring Cloud Consumer Bootstrap.
 */
@EnableScheduling
@Configuration
public class DubboSpringCloudConsumerRunners {

	@Reference
	private UserService userService;

	@Bean
	public ApplicationRunner userServiceRunner() {
		return arguments -> {

			User user = new User();
			user.setId(1L);
			user.setName("小马哥");
			user.setAge(33);

			// save User
			System.out.printf("UserService.save(%s) : %s\n", user,
					userService.save(user));

			// find all Users
			System.out.printf("UserService.findAll() : %s\n", user,
					userService.findAll());

			// remove User
			System.out.printf("UserService.remove(%d) : %s\n", user.getId(),
					userService.remove(user.getId()));

		};
	}
}
