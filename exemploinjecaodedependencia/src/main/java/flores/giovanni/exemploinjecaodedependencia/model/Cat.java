package flores.giovanni.exemploinjecaodedependencia.model;

import flores.giovanni.exemploinjecaodedependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Giovanni Flores
 * @since 11/06-2020 - 07:00
 * @version 1.0
 */
@Component
@Primary
@Qualifier("cat")
public class Cat implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("MIAAAUUUUUU!");
    }
}
