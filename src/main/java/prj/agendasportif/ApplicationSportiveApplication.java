package prj.agendasportif;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApplicationSportiveApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationSportiveApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CoursRepository repository) {
        return (args) -> {
            // Ajouter quelques cours à la base de données
            repository.save(new Cours("Yoga", "2024-02-25", "10:00", "Salle A", "Pierre"));
            repository.save(new Cours("Pilates", "2024-02-26", "11:00", "Salle B", "Paul"));
            repository.save(new Cours("Zumba", "2024-02-27", "12:00", "Salle C", "Jaques"));
        };
    }
}
