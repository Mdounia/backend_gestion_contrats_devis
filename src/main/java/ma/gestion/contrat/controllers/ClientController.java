package ma.gestion.contrat.controllers;

import ma.gestion.contrat.models.Client;
import ma.gestion.contrat.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/client")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {
	@Autowired
    private ClientService serviceClient;

    
    @GetMapping("all")
    public List<Client> getAll(){
        return this.serviceClient.findAll();
    }

    @PostMapping("create")
    public Client Add(@RequestBody Client client) {
        return this.serviceClient.save(client);
    }

    @DeleteMapping("delete/{id}")
    public void DeleteById(@PathVariable int id) {
        this.serviceClient.deleteById(id);
    }

    @PutMapping("update/{id}")
	public Client update(@RequestBody Client client,@PathVariable int id) {
		return serviceClient.update(client, id);
	}

  








}
