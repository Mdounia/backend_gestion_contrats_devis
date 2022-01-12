package ma.gestion.contrat.services;

import ma.gestion.contrat.dao.IDaoCrudsOperations;
import ma.gestion.contrat.models.Client;
import ma.gestion.contrat.repository.ICruds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements IDaoCrudsOperations<Client> {


    private ICruds<Client,Integer> clientIntegerICruds;

    @Autowired
    public ClientService(ICruds<Client, Integer> clientIntegerICruds) {
        this.clientIntegerICruds = clientIntegerICruds;
    }

    @Override
    public Client add(Client obj) {
        return this.clientIntegerICruds.save(obj);
    }

    @Override
    public void delete(int id) {
        this.clientIntegerICruds.deleteById(id);
    }

    @Override
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
    }

    @Override
    public List<Client> findAll() {
        return (List<Client>) this.clientIntegerICruds.findAll();
    }

    @Override
    public Optional<Client> findById(int id) {
        return (Optional<Client>)this.clientIntegerICruds.findById(id);
    }
}

