package com.marcosbarbero.wd;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.marcosbarbero.wd.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RestController
    class ProductController {
        private ObjectMapper mapper = new XmlMapper();

        private final ResourceLoader resourceLoader;

        ProductController(ResourceLoader resourceLoader) {
            this.resourceLoader = resourceLoader;
        }

        @GetMapping(value = "/product", produces = APPLICATION_XML_VALUE)
        public ResponseEntity<Product> product() throws IOException {
            Product product = mapper.readValue(resourceLoader.getResource("classpath:product.xml").getFile(), Product.class);
            return ResponseEntity.ok(product);
        }
    }
}
