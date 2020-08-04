package guru.springframework.sfgdi.services;
/*
 * Created by ta 8/2/2020.
 */

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World !! - From PRIMARY Bean";
    }
}
