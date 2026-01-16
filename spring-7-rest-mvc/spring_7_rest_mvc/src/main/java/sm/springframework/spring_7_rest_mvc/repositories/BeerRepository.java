package sm.springframework.spring_7_rest_mvc.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import sm.springframework.spring_7_rest_mvc.entities.Beer;

public interface BeerRepository extends JpaRepository<Beer, UUID> {

}
