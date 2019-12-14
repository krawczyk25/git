package pl.adrian.gitspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/Controller")
    public Person getPerson(){
        return new Person("Adrian","Krawczyk",22);
    }
}
