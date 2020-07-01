package lippert.matheus.BackFinal.service;

import lippert.matheus.BackFinal.model.ClientEntity;
import lippert.matheus.BackFinal.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientUpdateService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientEntity update(ClientEntity clientEntity) {
        return this.clientRepository.save(clientEntity);
    }

}
