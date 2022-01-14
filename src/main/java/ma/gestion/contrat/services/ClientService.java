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

    public Client update(Client client, int id) {
       Client cl=new Client();
       cl=this.findById(id).get();
       cl.setFirstname(client.getFirstname());
       cl.setLastname(client.getLastname());
       cl.setEmail(client.getEmail());
       cl.setTelephone(client.getTelephone());
       cl.setAddresse(client.getAddresse());
       this.save(cl); 
       return cl;
    }

 
}

