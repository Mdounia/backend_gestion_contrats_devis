package ma.gestion.contrat.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gestion.contrat.models.Contrat;
import ma.gestion.contrat.models.ContratProduit;
import ma.gestion.contrat.models.ContratProduitKey;
import ma.gestion.contrat.models.Produit;
import ma.gestion.contrat.repository.IContratProduit;

@Service
public class ContratProduitService {
	@Autowired
	private IContratProduit dao;
	
	@Autowired
	private ProduitService prService;
	
	@Autowired
	private ContratService cService;

	public void deleteAll() {
		dao.deleteAll();
	}

	public List<ContratProduit> findAll() {
		return dao.findAll();
	}

	public ContratProduit findById(ContratProduitKey id) {
		return dao.findById(id).get();
	}

	public ContratProduit save(ContratProduit contratProduit) {
		Produit pr=prService.findById(contratProduit.getProduit().getId());
		Contrat c= cService.findById(contratProduit.getContrat().getNumero()).get();
		ContratProduit cp =new ContratProduit();
		cp.setContrat(c);
		cp.setProduit(pr);
		cp.setMontant(contratProduit.getMontant());
		cp.setQuantite(contratProduit.getQuantite());
		return dao.save(cp);
	}
	
	

}
