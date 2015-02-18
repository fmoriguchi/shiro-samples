package com.sample.test;


/**
 * 
 * @author fabio
 *
 */
public class TestShiro {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	/*
		 //1.
	    Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");

	    //2.
	    SecurityManager securityManager = factory.getInstance();

	    //3.
	    SecurityUtils.setSecurityManager(securityManager);
	    
	    Subject currentUser = SecurityUtils.getSubject();
	    
	    System.out.println(currentUser + ": is authenticated ? "+ currentUser.isAuthenticated());
	    
	    if ( !currentUser.isAuthenticated() ) {
	        //collect user principals and credentials in a gui specific manner 
	        //such as username/password html form, X509 certificate, OpenID, etc.
	        //We'll use the username/password example here since it is the most common.
	        UsernamePasswordToken token = new UsernamePasswordToken("root", "secret");

	        //this is all you have to do to support 'remember me' (no config - built in!):
	        token.setRememberMe(true);

	        currentUser.login(token);
	    }

	    System.out.println( "User [" + currentUser.getPrincipal() + "] logged in successfully." );
	    System.out.println(currentUser + ": is authenticated ? "+ currentUser.isAuthenticated());

	    
	    // Avaliar se usuario "root" possui a permissao "admin"
	    if ( currentUser.hasRole("admin")) {
	    	System.out.println( "User [" + currentUser.getPrincipal() + "] is admin." );	    
	    }
	    
	    Session session = currentUser.getSession();
	    session.setAttribute( "someKey", "aValue" );
	    
	    System.exit(0);
		*/
	}

}
