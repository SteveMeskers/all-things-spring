package sm.springframework.spring_7_webapp.services;

import sm.springframework.spring_7_webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
