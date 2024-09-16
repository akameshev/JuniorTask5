package chat.client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository {
    private static List<Client> clientList = new ArrayList<>();

    private static List<Client> returnClientList(){
        return clientList;
    }
    private static void addClient(Client client){
        clientList.add(client);
    }
}
