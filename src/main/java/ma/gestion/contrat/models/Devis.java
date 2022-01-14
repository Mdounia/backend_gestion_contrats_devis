package ma.gestion.contrat.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Devis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code;
	private String libelle;
	@OneToMany(mappedBy = "devis")
	Set<DevisProduit> devisProduits;
	@ManyToOne
	private Client client;
	
	
	public Devis() {
		
	}

	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}
