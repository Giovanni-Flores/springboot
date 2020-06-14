package flores.giovanni.exemplolombok.controllers;

import flores.giovanni.exemplolombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Giovanni Flores
 * @since 10/06/2020 - 23:43
 * @version 1.0
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Exemplo lombok";
    }

//    @GetMapping("/product")
//    public String getProduct() {
//        return "Objeto produto";
//    }

}
