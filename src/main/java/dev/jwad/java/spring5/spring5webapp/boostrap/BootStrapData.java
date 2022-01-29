package dev.jwad.java.spring5.spring5webapp.boostrap;

import dev.jwad.java.spring5.spring5webapp.domain.Author;
import dev.jwad.java.spring5.spring5webapp.domain.Book;
import dev.jwad.java.spring5.spring5webapp.domain.Publisher;
import dev.jwad.java.spring5.spring5webapp.repositories.AuthorRepository;
import dev.jwad.java.spring5.spring5webapp.repositories.BookRepository;
import dev.jwad.java.spring5.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,
                         PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Data Driven Design", "123123");
        Publisher publisher = new Publisher("OReilly", "10 Madison Ave", "New York", "NY", "12345");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "456456");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Number of books " + bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());

    }
}
