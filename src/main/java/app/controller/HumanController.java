package app.controller;

import app.entity.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import app.repository.HumanRepository;

/*
 * -- @RestController annotation  --
 * Simplifies the creation of RESTful web services. 
 * It's a convenient annotation that combines @Controller and @ResponseBody, 
 * which eliminates the need to annotate every request handling method of 
 * the controller class with the @ResponseBody annotation.
 */
@RestController

/*
 * -- @RequestMapping --
 * Maps HTTP requests to handler methods of MVC (model view controller)
 * and REST controllers.
 */
@RequestMapping("/api")

@CrossOrigin("http://localhost:8081/")
public class HumanController {
    
    @Autowired
    private HumanRepository humanRepository;

    @GetMapping("/clients")
    public List<Human> fetchClients(){
        return humanRepository.findAll();
    }
}
