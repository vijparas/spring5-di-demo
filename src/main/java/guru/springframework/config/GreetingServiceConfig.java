package guru.springframework.config;
import guru.springframework.services.GreetingRepository;
import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingSessionFactory;
import guru.springframework.services.PrimaryGermanGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    private GreetingRepository greetingRepository;
    @Bean
    GreetingSessionFactory greetingSessionFactory(GreetingRepository repository){
        return new GreetingSessionFactory(repository);
    }
    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermancGreetingService(GreetingSessionFactory greetingSessionFactory){
        return greetingSessionFactory.createGreetingService("de");
    }

    @Bean
    @Primary
    @Profile("en")
    GreetingService primaryGreetingService(GreetingSessionFactory greetingSessionFactory){
        return greetingSessionFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService spanisGreetinghService(GreetingSessionFactory greetingSessionFactory){
        return greetingSessionFactory.createGreetingService("es");
    }


}
