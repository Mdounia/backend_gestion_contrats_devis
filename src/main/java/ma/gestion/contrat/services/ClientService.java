package ma.gestion.contrat.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gestion.contrat.models.Client;
import ma.gestion.contrat.repository.IClient;

@Service
public class ClientService  {


	@Autowired
    private IClient dao;

	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

	public List<Client> findAll() {
		return dao.findAll();
	}

	public Optional<Client> findById(Integer id) {
		return dao.findById(id);
	}

	public <S extends Client> S save(S entity) {
		return dao.save(entity);
	}

   

   /* @Override
    public Client update(Client obj, int id) {
        return this.clientIntegerICruds.findById(id)
                .map( item -> {
                    item.setAddresse(obj.getAddresse());
                    item.setFirstname(obj.getFirstname());
                    item.setLastname(obj.getLastname());
                    item.setEmail(obj.getEmail());
                    return this.clientIntegerICruds.save(item);
                }).orElseGet(() -> {
                    obj.setId(id);
                    return this.clientIntegerICruds.save(obj);
                });
    }*/

 
}

