package com.internship.internship.models;

import com.internship.internship.models.entity.Test;
import org.springframework.data.repository.CrudRepository;
/*
    Repository interface that works with Test entities
 */
public interface TestRepository extends CrudRepository<Test, Long> {
    /*
        Spring Data JPA creates an implementation when you run the application.
     */
}
