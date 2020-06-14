package flores.giovanni.exemplolombok.model;

import lombok.*;

/**
 * @author Giovanni Flores
 * @since 10/06/2020 - 23:57
 * @version 1.0
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastname;

    @Getter @Setter
    private int age;

    /**
     *
     * @return Retorna a idade em meses
     */
    public int calculateAgeInMonths() {
        return this.age * 12;
    }
}
