package dev.jwad.java.spring5.spring5webapp.repositories;

import dev.jwad.java.spring5.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
