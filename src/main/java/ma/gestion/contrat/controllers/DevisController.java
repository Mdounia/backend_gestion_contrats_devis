package ma.gestion.contrat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.gestion.contrat.models.Devis;
import ma.gestion.contrat.services.DevisService;

@RestController
@RequestMapping("/api/devis")
public class DevisController {
	
	@Autowired
	private DevisService service;

	@DeleteMapping("delete/{id}")
	public void deleteById(Integer id) {
		service.deleteById(id);
	}

	@GetMapping("all")
	public List<Devis> findAll() {
		return service.findAll();
	}

	@GetMapping("id/{id}")
	public Devis findById(Integer id) {
		return service.findById(id);
	}

	@PostMapping("create")
	public Devis save(Devis devis) {
		return service.save(devis);
	}
	
	
	

}
