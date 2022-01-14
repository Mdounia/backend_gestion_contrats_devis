package ma.gestion.contrat.services;

import ma.gestion.contrat.models.Fournisseur;
import ma.gestion.contrat.repository.IFournisseur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FournisseurService {
	@Autowired
    private IFournisseur dao;

	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

	public List<Fournisseur> findAll() {
		return dao.findAll();
	}

	public Optional<Fournisseur> findById(Integer id) {
		return dao.findById(id);
	}

	public <S extends Fournisseur> S save(S entity) {
		return dao.save(entity);
	}
	
	public Fournisseur update(Fournisseur fournisseur, int id) {
		Fournisseur fr=new Fournisseur();
		fr=this.findById(id).get();
		fr.setName(fournisseur.getName());
		fr.setEmail(fournisseur.getEmail());
		fr.setTelephone(fournisseur.getTelephone());
		fr.setAdresse(fournisseur.getAdresse());
		this.save(fr);
		return fr;
	}

}
