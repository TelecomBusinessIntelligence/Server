/**
 * @author Danyang Li
 */

package org.tbi.server.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.tbi.server.entity.User;

public interface Dao extends MongoRepository<User,String>{
	List<User> findByName(String name);
	User findOneByName(String name);
}
