package flores.giovanni.exemplolombok.controllers;

import flores.giovanni.exemplolombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Giovanni Flores
 * @since 10/06/2020 - 00:10
 * @version 1.0
 */
@RestController
public class ClientController {

//    @GetMapping("/client")
//    public Client getClient() {
//
//        //base de dados... banco de dados
//        Client client = new Client();
//        client.setName("Giovanni");
//        client.setLastname("Flores");
//        client.setAge(17);
//
//        return client;
//    }

    @GetMapping("/clients")
    public ArrayList<Client> getClients() {

        ArrayList<Client> clients = new ArrayList<>();

        //base de dados... banco de dados
        Client client = new Client();
        client.setName("Giovanni");
        client.setLastname("Flores");
        client.setAge(17);

        //base de dados... banco de dados
        Client client1 = new Client();
        client1.setName("John");
        client1.setLastname("Snow");
        client1.setAge(30);

        clients.add(client);
        clients.add(client1);

        return clients;

    }

}
