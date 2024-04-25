package by.lunev.javamentoryoutube;

import by.lunev.javamentoryoutube.entity.Product;
import by.lunev.javamentoryoutube.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JavaMentorYoutubeApplication  implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(JavaMentorYoutubeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Product product = new Product(null, "name1");
        productRepository.save(product);

        final List<Product> all = productRepository.findAll();
        System.out.println(all);
    }
}
