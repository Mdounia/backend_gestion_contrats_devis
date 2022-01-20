package ma.gestion.contrat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.gestion.contrat.models.ContratProduit;
import ma.gestion.contrat.services.ContratProduitService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v2/")
public class ContratProduitController {
	@Autowired
	private ContratProduitService service;

	@PostMapping("/ligneProduit")
	public ContratProduit save(@RequestBody ContratProduit entity) {
		return service.save(entity);
	}

	@GetMapping("/ligneProduit")
	public List<ContratProduit> findAll() {
		return service.findAll();
	}

	@GetMapping("/ligneProduit/{id}")
	public List<ContratProduit> findByContractId(@PathVariable Integer id) {
		return service.findByContractId(id);
	}
	
	
	
	

}
