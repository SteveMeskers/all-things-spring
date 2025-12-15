package sm.springframework.spring_7_webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import sm.springframework.spring_7_webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
