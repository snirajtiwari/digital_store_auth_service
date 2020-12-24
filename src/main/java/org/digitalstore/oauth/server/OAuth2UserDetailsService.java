package org.digitalstore.oauth.server;

import org.digitalstore.oauth.server.dao.UserDao;
import org.digitalstore.oauth.server.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class OAuth2UserDetailsService implements UserDetailsService
{
	@Autowired
	UserDao userDao;

	@Override
	public OAuth2UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException
	{
		UserDTO user = userDao.findByUserName(userName);
		if (user == null)
		{
			throw new UsernameNotFoundException("UserName " + userName + " not found");
		}
		return new OAuth2UserDetails(user);
	}
}
