/**
 * @author Danyang Li
 */

package org.tbi.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

@Configuration
public class MongoDbConfig {
	public @Bean MongoDbFactory mongoDbFactory() throws Exception{
		//Create a MongoDb client with internal connection pooling.
		//Set server address and port number with default value.
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		//Create a MongoDb instance with the database name "learningResults".
		return new SimpleMongoDbFactory(mongoClient, "learningResults");	
	}
	
	public @Bean MongoTemplate mongoTemplate() throws Exception{
		//MogoTemplate implements MongoOperations to perform CRUD operations on the database
		return new MongoTemplate(mongoDbFactory());
	}

}
