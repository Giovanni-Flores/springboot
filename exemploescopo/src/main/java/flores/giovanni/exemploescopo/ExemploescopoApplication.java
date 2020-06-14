package flores.giovanni.exemploescopo;

import flores.giovanni.exemploescopo.dao.ClassDAO;
import flores.giovanni.exemploescopo.dao.ClassJDBC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploescopoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploescopoApplication.class, args);

		ClassJDBC objJDBC = applicationContext.getBean(ClassJDBC.class);
		ClassJDBC objJDBC1 = applicationContext.getBean(ClassJDBC.class);

		ClassDAO objDAO = applicationContext.getBean(ClassDAO.class);
		ClassDAO objDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Obejto da classa JDBC" + objJDBC);
		System.out.println("Obejto da classa JDBC1" + objJDBC1);

		System.out.println("Obejto da classa DAO" + objDAO);
		System.out.println("Obejto da classa DAO1" + objDAO1);

	}

}
