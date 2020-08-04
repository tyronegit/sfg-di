package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * created by ta 7/30/2020.
 */

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World!! - Constructor";
    }
}
