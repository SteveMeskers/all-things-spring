package sm.springframework.spring_7_webapp.services;

import org.springframework.stereotype.Service;

import sm.springframework.spring_7_webapp.domain.Author;
import sm.springframework.spring_7_webapp.repositories.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }

}
