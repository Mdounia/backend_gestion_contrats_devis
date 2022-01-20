package ma.gestion.contrat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gestion.contrat.models.Devis;
import ma.gestion.contrat.models.DevisProduit;
import ma.gestion.contrat.models.Produit;
import ma.gestion.contrat.repository.IDevisProduit;

@Service
public class DevisProduitService {
	
	@Autowired
	private IDevisProduit dao;
	@Autowired
	private ProduitService prService;
	@Autowired
	private DevisService dService;
	
	public void deleteAll() {
		dao.deleteAll();
	}

	public DevisProduit save(DevisProduit devisProduit) {
		Produit pr=prService.findById(devisProduit.getProduit().getId());
		Devis d=dService.findById(devisProduit.getDevis().getCode());
		DevisProduit dp=new DevisProduit();
		dp.setDevis(d);
		dp.setProduit(pr);
		dp.setMontant(devisProduit.getMontant());
		dp.setQuantite(devisProduit.getQuantite());
		return dao.save(dp);
	}
	public List<DevisProduit> findAll() {
		
		return dao.findAll();
	}

	public List<DevisProduit> findByDevisId(Integer id) {
		return dao.findByDevisId(id);
	}
	
	

}
