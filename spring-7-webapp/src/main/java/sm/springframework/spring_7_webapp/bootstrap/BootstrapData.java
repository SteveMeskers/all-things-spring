package sm.springframework.spring_7_webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import sm.springframework.spring_7_webapp.domain.Author;
import sm.springframework.spring_7_webapp.domain.Book;
import sm.springframework.spring_7_webapp.domain.Publisher;
import sm.springframework.spring_7_webapp.repositories.AuthorRepository;
import sm.springframework.spring_7_webapp.repositories.BookRepository;
import sm.springframework.spring_7_webapp.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;



    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }



    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setIsbn("123456");;
        ddd.setTitle("Domain Driven design");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setIsbn("7891234");
        noEJB.setTitle("J2EE Development without EJB");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);
        dddSaved.getAuthors().add(ericSaved);
        noEJBSaved.getAuthors().add(rodSaved);

        Publisher abcPublisher = new Publisher();
        abcPublisher.setAddress("123 main street");
        abcPublisher.setCity("Flavor Town");
        abcPublisher.setPublisherName("ABC Publishing");
        abcPublisher.setState("AB");
        Publisher savedPublisher = publisherRepository.save(abcPublisher);

        dddSaved.setPublisher(savedPublisher);
        noEJBSaved.setPublisher(savedPublisher);
        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(noEJBSaved);

        System.out.println("In BootStrap");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Book count: " + bookRepository.count());
        System.out.println("Publisher count: " + publisherRepository.count());
    }

}
