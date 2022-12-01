package xyz.gdome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/app")
    public CreateResponse runApp() {
        return new CreateResponse("Welcome to my APP");
    }
    @GetMapping("/app/more-features")
    public CreateResponse runMoreFeatures() {
        return new CreateResponse("APP - More features");
    }

    record CreateResponse (String greet) {}
}

