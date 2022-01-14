package ma.gestion.contrat.controllers;

import ma.gestion.contrat.models.Client;
import ma.gestion.contrat.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    private final ClientService serviceClient;

    @Autowired
    public ClientController(ClientService serviceClient) {
        this.serviceClient = serviceClient;
    }

    @GetMapping
    public List<Client> GetAll(){
        return this.serviceClient.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Client> GetByID(@PathVariable int id) {return this.serviceClient.findById(id);}

    @PostMapping
    public Client Add(@RequestBody Client client) {
        return this.serviceClient.save(client);
    }

    @DeleteMapping("/{id}")
    public void DeleteById(@PathVariable int id) {
        this.serviceClient.deleteById(id);
    }

    @PutMapping("/{id}")
	public Client update(@RequestBody Client client,@PathVariable int id) {
		return serviceClient.update(client, id);
	}

  








}
