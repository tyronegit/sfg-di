package guru.springframework.sfgdi.services;
/*
 * Created by ta 8/2/2020.
 */

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World!! - property";
    }
}
