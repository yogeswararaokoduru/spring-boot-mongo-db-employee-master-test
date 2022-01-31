package com.org.cts.repository;

import com.org.cts.model.Employe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends MongoRepository<Employe,Integer> {
}
