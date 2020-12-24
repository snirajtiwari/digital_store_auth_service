package org.digitalstore.oauth.server;

public interface OAuth2Constants
{
	String	ACCESS_CONTROL_ALLOW_HEADERS	= "Access-Control-Allow-Headers";
	String	ACCESS_CONTROL_ALLOW_METHODS	= "Access-Control-Allow-Methods";
	String	ACCESS_CONTROL_ALLOW_ORIGIN		= "Access-Control-Allow-Origin";
	String	ACCESS_CONTROL_MAX_AGE			= "Access-Control-Max-Age";
	String	AUTHENTICATION_MANAGER_BEAN		= "authenticationManagerBean";
	String	AUTHORIZATION					= "Authorization";
	String	BEARER							= "Bearer ";
	String	HEADERS							= "Authorization, Content-Type,headers,lazyupdate,normalizednames";
	String	OAUTH_TOKEN						= "/oauth/token";
	String	OAUTH_TOKEN_REVOKE				= "/oauth/token_revoke";
	String	ORIGINS							= "*";
	String	PASSWORD						= "password";
	String	READ							= "read";
	String	REALM							= "SOM_REALM";
	String	REFRESH_TOKEN					= "refresh_token";
	String	REQUEST_TYPES					= "POST, PUT, GET, OPTIONS, DELETE";
	String	SOM_APPLICATION					= "936ea3d1-dc2b-43bc-88fc-70f28d111dbf";
	String	SOM_SECRET						= "DigitalSecret@123";
	String	TRUST							= "trust";
	String	WRITE							= "write";
	String	CLIENT_CREDENTIALS				= "client_credentials";
	int		THIRTY_DAYS						= 60 * 60 * 24 * 30;
	int		SIXTY_MINUTES					= 60 * 60;
	int		ONE_MINUTE						= 60;
	int		MAX_LOGIN_ATTEMPT				= 3;
}
