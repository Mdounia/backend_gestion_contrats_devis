package ma.gestion.contrat.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gestion.contrat.models.Produit;
import ma.gestion.contrat.repository.IProduit;

@Service
public class ProduitService {
	@Autowired
	private IProduit dao;

	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

	public List<Produit> findAll() {
		return dao.findAll();
	}

	public Produit findById(Integer id) {
		return dao.findById(id).get();
	}

	public Produit save(Produit produit) {
		return dao.save(produit);
	}
	
	
}
