package ma.gestion.contrat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.gestion.contrat.models.Contrat;
import ma.gestion.contrat.services.ContratService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/")
public class ContratController {

	@Autowired
	private ContratService service;

	@DeleteMapping("/contrats/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		service.deleteById(id);
	}

	@GetMapping("/contrats")
	public List<Contrat> findAll() {
		return service.findAll();
	}

	@GetMapping("/contrats/id/{id}")
	public Contrat findById(@PathVariable Integer id) {
		return service.findById(id).get();
	}

	@PostMapping("/contrats")
	public Contrat save(@RequestBody Contrat contrat) {
		return service.save(contrat);
	}
	
}
