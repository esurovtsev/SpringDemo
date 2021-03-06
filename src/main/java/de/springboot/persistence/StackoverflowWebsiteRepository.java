package de.springboot.persistence;

import de.springboot.model.StackoverflowWebsite;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StackoverflowWebsiteRepository extends MongoRepository<StackoverflowWebsite, String> {
    List<StackoverflowWebsite> findByWebsite(String website);
}
