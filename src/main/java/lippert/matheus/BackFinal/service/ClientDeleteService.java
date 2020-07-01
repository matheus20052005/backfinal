package lippert.matheus.BackFinal.service;

import lippert.matheus.BackFinal.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientDeleteService {

    @Autowired
    private ClientRepository clientRepository;

    public void delete(long id) {
        this.clientRepository.deleteById(id);
    }

}
