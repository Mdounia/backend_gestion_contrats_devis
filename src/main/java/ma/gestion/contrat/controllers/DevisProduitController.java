package ma.gestion.contrat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.gestion.contrat.models.DevisProduit;
import ma.gestion.contrat.services.DevisProduitService;

@RestController
@RequestMapping("api/devis/ligneProduit")
public class DevisProduitController {
	
	@Autowired
	private DevisProduitService service;


	@PostMapping("create")
	public DevisProduit save(@RequestBody DevisProduit entity) {
		return service.save(entity);
	}

	@GetMapping("all")
	public List<DevisProduit> findAll() {
		return service.findAll();
	}
	
	

}
