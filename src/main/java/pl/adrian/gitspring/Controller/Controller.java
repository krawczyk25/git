package pl.adrian.gitspring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.adrian.gitspring.Person;

@RestController
public class Controller {

    @GetMapping("/name")
    public Person getPerson(){
        return new Person("Adrian","Krawczyk",22);
    }
}
