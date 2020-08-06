package com.example.dubbo.service.impl;

import com.example.dubbo.entity.User;
import com.example.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * In-Memory {@link UserService} implementation.
 */
@Service(protocol = "dubbo")
public class InMemoryUserServiceImpl implements UserService {

	private Map<Long, User> usersRepository = new HashMap<>();

	@Override
	public boolean save(User user) {
		return usersRepository.put(user.getId(), user) == null;
	}

	@Override
	public boolean remove(Long userId) {
		return usersRepository.remove(userId) != null;
	}

	@Override
	public Collection<User> findAll() {
		return usersRepository.values();
	}

}
