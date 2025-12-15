package sm.springframework.spring_7_webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import sm.springframework.spring_7_webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
