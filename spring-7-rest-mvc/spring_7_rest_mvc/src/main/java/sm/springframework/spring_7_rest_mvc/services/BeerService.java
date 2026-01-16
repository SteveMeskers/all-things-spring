package sm.springframework.spring_7_rest_mvc.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import sm.springframework.spring_7_rest_mvc.model.BeerDTO;

public interface BeerService {
    Optional<BeerDTO> getBeerById(UUID id);
    List<BeerDTO> listBeers();
    BeerDTO saveNewBeer(BeerDTO beer);
    Optional<BeerDTO> updateBeerById(UUID beerId, BeerDTO beer);
    Boolean deleteById(UUID beerId);
    Optional<BeerDTO> patchBeerById(UUID beerId, BeerDTO beer);
}
