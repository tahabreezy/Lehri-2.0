package emsi.lehri.services;

import emsi.lehri.entities.Client;
import emsi.lehri.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    public void AddClient(Client client) {
        clientRepository.save(client);
    }

}
