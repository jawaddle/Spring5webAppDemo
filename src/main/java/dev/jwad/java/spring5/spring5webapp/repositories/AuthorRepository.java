package dev.jwad.java.spring5.spring5webapp.repositories;

import dev.jwad.java.spring5.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
