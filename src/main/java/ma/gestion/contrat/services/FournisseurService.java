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

}
