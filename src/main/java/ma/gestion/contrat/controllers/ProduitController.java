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

import ma.gestion.contrat.models.Produit;
import ma.gestion.contrat.services.ProduitService;

@RestController
@RequestMapping("/api/produit")
public class ProduitController {
	@Autowired
	private ProduitService service;

	@DeleteMapping("delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		service.deleteById(id);
	}

	@GetMapping("")
	public List<Produit> findAll() {
		return service.findAll();
	}

	@GetMapping("{id}")
	public Produit findById(@PathVariable Integer id) {
		return service.findById(id);
	}

	@PostMapping("create")
	public Produit save(@RequestBody Produit produit) {
		return service.save(produit);
	}
	
	

}
