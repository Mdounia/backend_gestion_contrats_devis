package ma.gestion.contrat.controllers;

import ma.gestion.contrat.models.Fournisseur;
import ma.gestion.contrat.services.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/fournisseur")
public class FournisseurController {
    private final FournisseurService serviceFournisseur;

    @Autowired
    public FournisseurController(FournisseurService serviceFournisseur) {
        this.serviceFournisseur = serviceFournisseur;
    }

    @GetMapping("")
    public List<Fournisseur> GetAll(){
        return this.serviceFournisseur.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Fournisseur> GetByID(@PathVariable int id) {return this.serviceFournisseur.findById(id);}

    @PostMapping("/create")
    public Fournisseur Add(@RequestBody Fournisseur fournisseur) {
        return this.serviceFournisseur.save(fournisseur);
    }

    @DeleteMapping("/{id}")
    public void DeleteById(@PathVariable int id) {
        this.serviceFournisseur.deleteById(id);
    }

    @PutMapping("/{id}")
	public Fournisseur update(@RequestBody Fournisseur fournisseur,@PathVariable int id) {
		return serviceFournisseur.update(fournisseur, id);
	}

    
    

}
