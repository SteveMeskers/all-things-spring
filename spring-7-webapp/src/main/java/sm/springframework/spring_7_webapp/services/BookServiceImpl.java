package sm.springframework.spring_7_webapp.services;

import org.springframework.stereotype.Service;

import sm.springframework.spring_7_webapp.domain.Book;
import sm.springframework.spring_7_webapp.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

}
