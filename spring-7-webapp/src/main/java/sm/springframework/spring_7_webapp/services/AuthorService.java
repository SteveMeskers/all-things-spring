package sm.springframework.spring_7_webapp.services;

import sm.springframework.spring_7_webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
