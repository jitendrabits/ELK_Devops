package com.lemoncode21.springlogelk.repository;

import com.lemoncode21.springlogelk.entity.DetailsEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DetailsRepository extends MongoRepository<DetailsEntry, ObjectId> {
}
