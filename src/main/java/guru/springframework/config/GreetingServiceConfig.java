package guru.springframework.config;
<<<<<<< HEAD
import guru.springframework.services.GreetingRepository;
import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingSessionFactory;
import guru.springframework.services.PrimaryGermanGreetingService;
=======

import guru.springframework.services.GreetingRepository;
import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceFactory;
>>>>>>> df873e997789ac6a111bd4aa234f3b89343e68c9
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

<<<<<<< HEAD
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
=======
/**
 * Created by jt on 5/25/17.
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingSevice("en");
>>>>>>> df873e997789ac6a111bd4aa234f3b89343e68c9
    }

    @Bean
    @Primary
<<<<<<< HEAD
    @Profile("en")
    GreetingService primaryGreetingService(GreetingSessionFactory greetingSessionFactory){
        return greetingSessionFactory.createGreetingService("en");
=======
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingSevice("es");
>>>>>>> df873e997789ac6a111bd4aa234f3b89343e68c9
    }

    @Bean
    @Primary
<<<<<<< HEAD
    @Profile("es")
    GreetingService spanisGreetinghService(GreetingSessionFactory greetingSessionFactory){
        return greetingSessionFactory.createGreetingService("es");
    }


=======
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingSevice("de");
    }
>>>>>>> df873e997789ac6a111bd4aa234f3b89343e68c9
}
