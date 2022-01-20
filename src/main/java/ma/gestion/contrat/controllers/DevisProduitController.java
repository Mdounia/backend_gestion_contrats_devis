package ma.gestion.contrat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.gestion.contrat.models.DevisProduit;
import ma.gestion.contrat.services.DevisProduitService;

@RestController
@RequestMapping("api/v4/")
public class DevisProduitController {
	
	@Autowired
	private DevisProduitService service;


	@PostMapping("/ligneProduitDevis")
	public DevisProduit save(@RequestBody DevisProduit entity) {
		return service.save(entity);
	}

	@GetMapping("/ligneProduitDevis")
	public List<DevisProduit> findAll() {
		return service.findAll();
	}

	@GetMapping("/ligneProduitDevis/{id}")
	public List<DevisProduit> findByDevisId(@PathVariable Integer id) {
		return service.findByDevisId(id);
	}
	
	

}
