package spring5.application.webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring5.application.webapp.model.Author;
import spring5.application.webapp.model.Book;
import spring5.application.webapp.model.Publisher;
import spring5.application.webapp.repositories.AuthorRepository;
import spring5.application.webapp.repositories.BookRepository;
import spring5.application.webapp.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {
   private final AuthorRepository authorRepository;
   private final BookRepository bookRepository;
   private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository=publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher piyush = new Publisher("ArtVid Publishing","Agriculture Firm gate-1","Burdwan","West-Bengal",713101);
        publisherRepository.save(piyush);

        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","12323");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(piyush);
        piyush.getBooks().add(ddd);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Development without EJB","23422");
        eric.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(piyush);
        piyush.getBooks().add(noEJB);
        authorRepository.save(rod);
        bookRepository.save(noEJB);




        System.out.println("Started in Bootstrap..");
        System.out.println("Number of Books: "+bookRepository.count());
        System.out.println("Publisher Books Count: "+piyush.getBooks().size());


    }
}
