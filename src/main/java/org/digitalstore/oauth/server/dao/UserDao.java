package org.digitalstore.oauth.server.dao;

import org.digitalstore.oauth.server.dto.UserDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends MongoRepository<UserDTO, Long>
{

	UserDTO findByUserName(final String userName);

}
