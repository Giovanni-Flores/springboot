package flores.giovanni.exemplohelloworldrestrepositories.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Giovanni Flores
 * @since 11/06/2020 - 23:00
 * @version 1.0
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Olá! Hello World com rest repositories";
    }
}
