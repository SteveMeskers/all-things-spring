package sm.springframework.spring_7_rest_mvc.bootstrap;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import sm.springframework.spring_7_rest_mvc.entities.Beer;
import sm.springframework.spring_7_rest_mvc.model.BeerStyle;
import sm.springframework.spring_7_rest_mvc.entities.Customer;
import sm.springframework.spring_7_rest_mvc.repositories.BeerRepository;
import sm.springframework.spring_7_rest_mvc.repositories.CustomerRepository;

@Component
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {
    private final BeerRepository beerRepository;
    private final CustomerRepository customerRepository;

    public void run(String... args) throws Exception {
        loadBeerData();
        loadCustomerData();
    }

    private void loadBeerData() {
        if (beerRepository.count() == 0){
        Beer beer1 = Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle(BeerStyle.PALE_ALE)
                    .upc("12356")
                    .price(new BigDecimal("12.99"))
                    .quantityOnHand(122)
                    .createdDate(LocalDateTime.now())
                    .updatedDate(LocalDateTime.now())
                    .build();

            Beer beer2 = Beer.builder()
                    .beerName("Crank")
                    .beerStyle(BeerStyle.PALE_ALE)
                    .upc("12356222")
                    .price(new BigDecimal("11.99"))
                    .quantityOnHand(392)
                    .createdDate(LocalDateTime.now())
                    .updatedDate(LocalDateTime.now())
                    .build();

            Beer beer3 = Beer.builder()
                    .beerName("Sunshine City")
                    .beerStyle(BeerStyle.IPA)
                    .upc("12356")
                    .price(new BigDecimal("13.99"))
                    .quantityOnHand(144)
                    .createdDate(LocalDateTime.now())
                    .updatedDate(LocalDateTime.now())
                    .build();
            
            beerRepository.save(beer1);
            beerRepository.save(beer2);
            beerRepository.save(beer3);
        }
    }

    private void loadCustomerData() {
        if (customerRepository.count() == 0) {
            Customer customer1 = Customer.builder()
                .customerName("Bob")
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();

            Customer customer2 = Customer.builder()
                .customerName("Jim")
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();

            Customer customer3 = Customer.builder()
                .customerName("Tim")
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();

            customerRepository.save(customer1);
            customerRepository.save(customer2);
            customerRepository.save(customer3);
        }
    }

}
