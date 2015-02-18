/**
 * 
 */
package com.sample.infrastructure.user.dao.memory;

import java.util.HashMap;
import java.util.Map;

import com.sample.domain.user.User;
import com.sample.infrastructure.user.dao.UserDAO;

/**
 * @author fabio
 *
 */
public final class UserMemoryDAO implements UserDAO {
	
	/**
	 * 
	 */
	private static final Map<String, User> USERS = new HashMap<>();

	@Override
	public User store(User user) {
	
		return USERS.put(user.getUsername(), user);
	}

	@Override
	public User find(String username) {

		return USERS.get(username);
	}	
}
