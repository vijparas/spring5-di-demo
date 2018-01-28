package guru.springframework.services;


import org.springframework.beans.factory.annotation.Autowired;

public class PrimaryGreetingService implements GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;


    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
