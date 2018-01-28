package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;


public class PrimaryGermanGreetingService implements GreetingService {
    @Autowired
    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
