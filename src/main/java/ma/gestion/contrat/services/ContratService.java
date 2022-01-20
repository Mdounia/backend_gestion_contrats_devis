package ma.gestion.contrat.services;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gestion.contrat.models.Contrat;
import ma.gestion.contrat.models.ContratProduit;
import ma.gestion.contrat.models.Produit;
import ma.gestion.contrat.models.Role;
import ma.gestion.contrat.repository.IContrat;

import ma.gestion.contrat.repository.IProduit;

@Service
public class ContratService {
	@Autowired
	private IContrat dao;
	
	@Autowired
	private ContratProduitService cpService;
	
	@Autowired
	private ProduitService prService;

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
		/*Set<ContratProduit> ligneProduit =contrat.getContratProduits();
		for (ContratProduit contratProduit : ligneProduit) {
			Produit pr=prService.findById(contratProduit.getProduit().getId());
			ContratProduit cp =new ContratProduit();
			cp.setContrat(contrat);
			cp.setProduit(pr);
			cp.setMontant(contratProduit.getMontant());
			cp.setQuantite(contratProduit.getQuantite());
			//cpService.save(cp);
			//contrat.setContratProduits(ligneProduit);
		}*/
		/*Contrat newContrat = new Contrat();
		newContrat.setDescription(contrat.getDescription());
		newContrat.setDateDebut(contrat.getDateDebut());
		newContrat.setDateFin(contrat.getDateFin());
		newContrat.setClient(contrat.getClient());
		newContrat.setStatus(contrat.getStatus());
        newContrat.getContratProduits().addAll((contrat.getContratProduits()
                .stream()
                .map(cp -> {
                    Produit pr = prService.findById(cp.getProduit().getId());
                    ContratProduit cp1 = new ContratProduit();
                    cp1.setContrat(contrat);
        			cp1.setProduit(pr);
        			cp1.setMontant(cp.getMontant());
        			cp1.setQuantite(cp.getQuantite());
        			cpService.save(cp1);
                    return cp1;
                    
                })
                .collect(Collectors.toList())
        ));*/
        
		return dao.save(contrat);
	}
	
	public Contrat update(Contrat contrat,int id) {
		Contrat c=this.findById(id);
		c.setStatus(contrat.getStatus());
		return dao.save(c);
	}

}
