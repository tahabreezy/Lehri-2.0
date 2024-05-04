package emsi.lehri.services;

import emsi.lehri.entities.Client;
import emsi.lehri.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private ClientRepository clientRepository;
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    public void AddClient(Client client) {
        clientRepository.save(client);
    }

}
