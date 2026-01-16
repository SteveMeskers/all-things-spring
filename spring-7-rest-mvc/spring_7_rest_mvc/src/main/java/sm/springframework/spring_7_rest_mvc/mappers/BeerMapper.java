package sm.springframework.spring_7_rest_mvc.mappers;

import org.mapstruct.Mapper;

import sm.springframework.spring_7_rest_mvc.entities.Beer;
import sm.springframework.spring_7_rest_mvc.model.BeerDTO;

@Mapper
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDTO dto);
    BeerDTO beerToBeerDto(Beer beer);
}
