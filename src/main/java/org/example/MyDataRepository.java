package org.example;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MyDataRepository extends MongoRepository<MyData, String> {
}
