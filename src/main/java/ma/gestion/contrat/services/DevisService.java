package ma.gestion.contrat.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gestion.contrat.models.Devis;
import ma.gestion.contrat.repository.IDevis;

@Service
public class DevisService {
	
	@Autowired
	private IDevis dao;

	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

	public List<Devis> findAll() {
		return dao.findAll();
	}

	public Devis findById(Integer id) {
		return dao.findById(id).get();
	}

	public Devis save(Devis devis) {
		return dao.save(devis);
	}
	
	

}
