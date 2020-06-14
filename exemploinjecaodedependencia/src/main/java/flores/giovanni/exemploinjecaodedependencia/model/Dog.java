package flores.giovanni.exemploinjecaodedependencia.model;

import flores.giovanni.exemploinjecaodedependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Giovanni Flores
 * @since 11/06-2020 - 06:57
 * @version 1.0
 */
@Component
@Qualifier("dog")
public class Dog implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("AUUU AUUU!");
    }
}
