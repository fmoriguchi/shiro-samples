package com.sample.shiro.custom.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.AuthenticatingRealm;

import com.sample.domain.user.User;
import com.sample.infrastructure.user.dao.UserDAO;
import com.sample.infrastructure.user.dao.memory.UserMemoryDAO;

/**
 * 
 * @author fabio
 *
 */
public class MemoryAuthenticatingRealm extends AuthenticatingRealm {
	
	//Injetar .....
	private final UserDAO dao;
	
	/**
	 * 
	 * @param dao
	 */
	public MemoryAuthenticatingRealm(UserDAO dao) {
		
		this.dao = dao;
	}
	
	/**
	 * 
	 */
	public MemoryAuthenticatingRealm() {
	
		this.dao = new UserMemoryDAO();
	}
	
	@Override
	public boolean supports(AuthenticationToken token) {
	
		return true;
	}
	

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
	
		UsernamePasswordToken userToken = (UsernamePasswordToken) token;
		
		User user = dao.find(userToken.getUsername());
		
		if (user == null) {
			
			throw new AuthenticationException("Invalid username");
		}
		
		boolean validPassword = comparePassword(user, userToken);
		
		if (!validPassword) {
			
			throw new AuthenticationException("Invalid password");
		}
		
		return new SimpleAuthenticationInfo(user, "", "memory");
	}
	
	/**
	 * 
	 * @param user
	 * @param token
	 * @return
	 */
	boolean comparePassword(User user, UsernamePasswordToken token){
		
		return true;
	}

}
