package ma.gestion.contrat.services;

import ma.gestion.contrat.dao.IDaoCrudsOperations;
import ma.gestion.contrat.models.Fournisseur;
import ma.gestion.contrat.repository.ICruds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FournisseurService implements IDaoCrudsOperations<Fournisseur> {

    private ICruds<Fournisseur,Integer> fournisseurIntegerICruds;

    @Autowired
    public FournisseurService(ICruds<Fournisseur, Integer> fournisseurIntegerICruds) {
        this.fournisseurIntegerICruds = fournisseurIntegerICruds;
    }

    @Override
    public Fournisseur add(Fournisseur obj) {
        return this.fournisseurIntegerICruds.save(obj);
    }

    @Override
    public void delete(int id) {
        this.fournisseurIntegerICruds.deleteById(id);
    }

    @Override
    public Fournisseur update(Fournisseur obj, int id) {
        return this.fournisseurIntegerICruds.findById(id)
                .map( item -> {
                    item.setName(obj.getName());
                    item.setAdresse(obj.getAdresse());
                    item.setEmail(obj.getEmail());
                    item.setTelephone(obj.getTelephone());
                    return this.fournisseurIntegerICruds.save(item);
                }).orElseGet(() -> {
                    obj.setId(id);
                    return this.fournisseurIntegerICruds.save(obj);
                });
    }

    @Override
    public List<Fournisseur> findAll() {
        return (List<Fournisseur>) this.fournisseurIntegerICruds.findAll();
    }

    @Override
    public Optional<Fournisseur> findById(int id) {
        return (Optional<Fournisseur>) this.fournisseurIntegerICruds.findById(id);
    }
}
