/**
 * 
 */
package com.sample.infrastructure.user.dao;

import com.sample.domain.user.User;

/**
 * @author fabio
 *
 */
public interface UserDAO {
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	User store(User user);
	
	/**
	 * 
	 * @param username
	 * @return
	 */
	User find(String username);
}
