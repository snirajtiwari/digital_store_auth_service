package org.digitalstore.oauth.server;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

public class CustomTokenEnhancer implements TokenEnhancer, OAuth2Path
{

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication)
	{
		if (OAuth2UserDetails.class.isInstance(authentication.getPrincipal()))
		{
			OAuth2UserDetails user = (OAuth2UserDetails) authentication.getPrincipal();

			final Map<String, Object> additionalInfo = new HashMap<>();

			additionalInfo.put(USER_ID, user.getUser().getUserId());
			additionalInfo.put(USER_NAME, user.getUser().getUserName());
			//additionalInfo.put(USER_FULL_NAME, user.getUser().getFullName());
			additionalInfo.put(USER_ROLE, user.getUser().getRoleName());
			
			((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);
		}
		return accessToken;
	}

}
