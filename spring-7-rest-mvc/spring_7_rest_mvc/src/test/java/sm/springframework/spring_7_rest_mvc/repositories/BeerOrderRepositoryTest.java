package sm.springframework.spring_7_rest_mvc.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.transaction.Transactional;
import sm.springframework.spring_7_rest_mvc.entities.Beer;
import sm.springframework.spring_7_rest_mvc.entities.BeerOrder;
import sm.springframework.spring_7_rest_mvc.entities.BeerOrderShipment;
import sm.springframework.spring_7_rest_mvc.entities.Customer;

@SpringBootTest
public class BeerOrderRepositoryTest {
  @Autowired
  BeerOrderRepository beerOrderRepository;
  @Autowired
  CustomerRepository customerRepository;
  @Autowired
  BeerRepository beerRepository;

  Customer testCustomer;
  Beer testBeer;

  @BeforeEach
  void setUp() {
    testCustomer = customerRepository.findAll().get(0);
    testBeer = beerRepository.findAll().get(0);
  }

  @Transactional
  @Test
  void testBeerOrders() {
    BeerOrder beerOrder = BeerOrder.builder()
        .customerRef("Test order")
        .customer(testCustomer)
        .beerOrderShipment(BeerOrderShipment.builder()
          .trackingNumber("123")
          .build())
        .build();

    BeerOrder savBeerOrder = beerOrderRepository.save(beerOrder);
    String a = "";
  }
}
