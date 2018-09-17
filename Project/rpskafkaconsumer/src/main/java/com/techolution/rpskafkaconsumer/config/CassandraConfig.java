package com.techolution.rpskafkaconsumer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@PropertySource(value = { "classpath:cassandra.properties" })
@EnableCassandraRepositories(basePackages = { "com.techolution.rpskafkaconsumer.result" })
public class CassandraConfig extends AbstractCassandraConfiguration {

	@Value("${cassandra.keyspace}")
	private String keySpace;
	
	@Override
	protected String getKeyspaceName() {
		return keySpace;
	}
	
    @Override
    public String[] getEntityBasePackages() {
        return new String[]{"com.techolution.rpskafkaconsumer.result"};
    }

}
