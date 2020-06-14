package flores.giovanni.exemplopostconstructpredestroy;

import flores.giovanni.exemplopostconstructpredestroy.dao.ClientDAO;
import flores.giovanni.exemplopostconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemplopostconstructpredestroyApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);


		clientDAO.setClient(new Client("Giovanni", "Flores"));

		System.out.println("ClientDAO: " + clientDAO);
		System.out.println("Client: " + clientDAO.getClient().toString());
	}

}
