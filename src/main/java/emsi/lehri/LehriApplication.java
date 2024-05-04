package emsi.lehri;

import emsi.lehri.entities.Client;
import emsi.lehri.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LehriApplication implements CommandLineRunner {

    @Autowired
    private ClientRepository clientRepository;

    public static void main(String[] args) {
        SpringApplication.run(LehriApplication.class, args);
    }

    @Override
    public void run(String... args) {
        clientRepository.save(new Client(null,"Mohamad","moulhanouta@lehri.ma","0631313131","NoCredit00"));


    }
}
