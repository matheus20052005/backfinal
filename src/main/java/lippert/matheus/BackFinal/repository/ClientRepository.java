package lippert.matheus.BackFinal.repository;

import lippert.matheus.BackFinal.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author matheus
 * @version 1.0
 * @since 27/06/2020
 * @category Repository
 */

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
}
