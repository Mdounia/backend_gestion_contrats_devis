package ma.gestion.contrat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.gestion.contrat.models.Contrat;
import ma.gestion.contrat.services.ContratService;

@RestController
@RequestMapping("/api/contrat")
public class ContratController {

	@Autowired
	private ContratService service;

	@DeleteMapping("delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		service.deleteById(id);
	}

	@GetMapping("all")
	public List<Contrat> findAll() {
		return service.findAll();
	}

	@GetMapping("id/{id}")
	public Contrat findById(Integer id) {
		return service.findById(id);
	}

	@PostMapping("create")
	public Contrat save(Contrat contrat) {
		return service.save(contrat);
	}
	
}
