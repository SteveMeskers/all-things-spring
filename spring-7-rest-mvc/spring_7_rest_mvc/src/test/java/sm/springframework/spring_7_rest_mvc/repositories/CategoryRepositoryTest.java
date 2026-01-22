package sm.springframework.spring_7_rest_mvc.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.transaction.Transactional;
import sm.springframework.spring_7_rest_mvc.entities.Beer;
import sm.springframework.spring_7_rest_mvc.entities.Category;

@SpringBootTest
public class CategoryRepositoryTest {
  @Autowired
  CategoryRepository categoryRepository;
  @Autowired
  BeerRepository beerRepository;

  Beer testBeer;
  
  @BeforeEach
  void setUp() {
    testBeer = beerRepository.findAll().get(0);
  }

  @Transactional
  @Test
  void testAddCategory() {
    Category savedCategory = categoryRepository.save(Category.builder()
      .description("Ales")
      .build());

    testBeer.addCategory(savedCategory);
    Beer savedBeer = beerRepository.save(testBeer);
    String a ="";
  }
}
