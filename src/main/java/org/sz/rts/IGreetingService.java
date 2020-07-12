package org.sz.rts;

import java.util.List;

interface IGreetingService {
    Greeting addGreeting(Greeting greeting);
    List<Greeting> getAll();
}
