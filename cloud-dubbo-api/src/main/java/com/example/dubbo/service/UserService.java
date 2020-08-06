

package com.example.dubbo.service;

import com.example.dubbo.entity.User;

import java.util.Collection;

/**
 * {@link User} Service.
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 */
public interface UserService {

	boolean save(User user);

	boolean remove(Long userId);

	Collection<User> findAll();

}
