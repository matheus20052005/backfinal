package lippert.matheus.BackFinal.service;

import lippert.matheus.BackFinal.model.ClientEntity;
import lippert.matheus.BackFinal.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//SpringBoot
@Service
public class ClientFindByIdService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientEntity findByID(long id) {
        return this.clientRepository.findById(id).get();
    }

}
