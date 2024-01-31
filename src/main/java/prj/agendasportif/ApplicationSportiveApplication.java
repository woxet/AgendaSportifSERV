package prj.agendasportif;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan("prj.agendasportif")
public class ApplicationSportiveApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationSportiveApplication.class, args);
    }
    @Bean
    public CommandLineRunner demo(UserRepository repository) {
        return (args) -> {
            // rajouter quelques utilisateurs de la repository
            repository.save(new User(1,"Jack", 25));
            repository.save(new User(2,"Chloe", 32));
            repository.save(new User(3,"Kim", 34));
        };
    }
}
