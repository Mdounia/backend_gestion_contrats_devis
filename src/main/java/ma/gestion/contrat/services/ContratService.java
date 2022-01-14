package ma.gestion.contrat.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gestion.contrat.models.Contrat;
import ma.gestion.contrat.repository.IContrat;

@Service
public class ContratService {
	@Autowired
	private IContrat dao;

	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

	public List<Contrat> findAll() {
		return dao.findAll();
	}

	public Contrat findById(Integer id) {
		return dao.findById(id).get();
	}

	public Contrat save(Contrat contrat) {
		return dao.save(contrat);
	}
	
	

}
