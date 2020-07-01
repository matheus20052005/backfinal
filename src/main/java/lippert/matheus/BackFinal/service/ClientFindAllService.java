package lippert.matheus.BackFinal.service;

import lippert.matheus.BackFinal.model.ClientEntity;
import lippert.matheus.BackFinal.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientFindAllService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientEntity> findAll() {
        return (List<ClientEntity>) this.clientRepository.findAll();
    }

}
