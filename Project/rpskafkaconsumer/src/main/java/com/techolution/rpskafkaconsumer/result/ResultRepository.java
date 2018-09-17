package com.techolution.rpskafkaconsumer.result;

import java.time.LocalDateTime;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends CassandraRepository<Result, LocalDateTime>{

}
