package flores.giovanni.exemploinjecaodedependencia;

import flores.giovanni.exemploinjecaodedependencia.interfaces.AnimalInterface;
import flores.giovanni.exemploinjecaodedependencia.model.Cat;
import flores.giovanni.exemploinjecaodedependencia.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Giovanni Flores
 * @since 11/06-2020 - 07:01
 * @version 1.0
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("dog")
    private AnimalInterface animalInterface;

//    /**
//     *
//     * @param animalInterface Recebe animal interface
//     */
//    public Pet(AnimalInterface animalInterface) {
//        this.animalInterface = animalInterface;
//    }

    public void execute() {
        animalInterface.comunicar();
    }

    // maneira acoplada! ERRADO
//    public void execute() {
//        animalInterface = new Cat();
//        animalInterface.comunicar();
//    }
}
