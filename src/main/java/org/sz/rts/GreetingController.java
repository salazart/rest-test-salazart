package org.sz.rts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class GreetingController {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private IGreetingService greetingService;

    private static final String template = "Hello, %s!";

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        Greeting greeting = new Greeting(String.format(template, name),
                LocalDateTime.now(), request.getRemoteAddr());
        greeting = greetingService.addGreeting(greeting);
        return greeting;
    }

    @GetMapping("/allGreetings")
    public List<Greeting> allGreetings() {
        return greetingService.getAll();
    }
}