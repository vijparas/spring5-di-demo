package guru.springframework.services;

public class GreetingSessionFactory {
    private GreetingRepository greetingRepository;

    public GreetingSessionFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang){
        switch (lang){
            case "en":
                return  new PrimaryGermanGreetingService();
            case "de":
                return  new PrimaryGermanGreetingService();

            case "es":
                return  new PrimarySpanishGreetingService();

             default:
                 return new PrimaryGreetingService();
        }
    }
}
