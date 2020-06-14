package flores.giovanni.exemplopostconstructpredestroy.model;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author Giovanni Flores
 * @since 11/06/2020 - 7:49
 * @version 1.0
 */

//Lombok
@ToString
@Getter @Setter
@AllArgsConstructor

//Springboot
@Component
public class Client {

    private String name;
    private String lastName;

    public Client() {
        System.out.println("Classe client!");
    }
}
