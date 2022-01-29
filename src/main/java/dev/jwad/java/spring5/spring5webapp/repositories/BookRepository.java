package dev.jwad.java.spring5.spring5webapp.repositories;

import dev.jwad.java.spring5.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
