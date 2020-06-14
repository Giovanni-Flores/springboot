package flores.giovanni.ExemploGradle;

import flores.giovanni.ExemploGradle.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemploGradleApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExemploGradleApplication.class, args);

		//objeto 1
		Cliente cliente = new Cliente();
		cliente.setName("Giovanni");
		cliente.setSobrenome("Flores");
		System.out.println(cliente);

		//objeto 2
		Cliente cliente1 = new Cliente("Zé", "Silva",0);
		System.out.println(cliente1);

		//objeto 3
		System.out.println(new Cliente("João", "Mendes", 1000));
	}

}
