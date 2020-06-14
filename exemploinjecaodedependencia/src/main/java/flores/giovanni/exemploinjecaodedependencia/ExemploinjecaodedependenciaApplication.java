package flores.giovanni.exemploinjecaodedependencia;

import flores.giovanni.exemploinjecaodedependencia.model.Cat;
import flores.giovanni.exemploinjecaodedependencia.model.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Giovanni Flores
 * @since 11/06-2020 - 07:04
 * @version 1.0
 */
@SpringBootApplication
public class ExemploinjecaodedependenciaApplication {

	public static void main(String[] args) {

		// 3 maneira
		ApplicationContext applicationContext = SpringApplication.run(ExemploinjecaodedependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();


		// 1 maneira - acoplado! ERRADO
//		Pet pet = new Pet();
//		pet.execute();

//		// 2 maneira - menos acoplado!
//		Pet pet = new Pet(new Cat());
//		pet.execute();
//
//		Pet pet1 = new Pet(new Dog());
//		pet1.execute();


	}
}
