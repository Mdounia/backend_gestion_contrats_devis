package ma.gestion.contrat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.gestion.contrat.models.Devis;
import ma.gestion.contrat.services.DevisService;

@RestController
@RequestMapping("/api/v3/")
public class DevisController {
	
	@Autowired
	private DevisService service;

	@DeleteMapping("/devis/{id}")
	public void deleteById(@PathVariable Integer id) {
		service.deleteById(id);
	}

	@GetMapping("/devis")
	public List<Devis> findAll() {
		return service.findAll();
	}

	@GetMapping("/devis/{id}")
	public Devis findById(@PathVariable Integer id) {
		return service.findById(id);
	}

	@PostMapping("/devis")
	public Devis save(@RequestBody Devis devis) {
		return service.save(devis);
	}
	
	
	

}
