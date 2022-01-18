package ma.gestion.contrat.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Contrat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numero;
	private String description;
	private Date dateDebut;
	private Date dateFin;
	private String status;
	@OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<ContratProduit> contratProduits=new HashSet<ContratProduit>();
	@ManyToOne
	private Client client;
	
	public Contrat() {

	}
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<ContratProduit> getContratProduits() {
		return contratProduits;
	}

	public void setContratProduits(Set<ContratProduit> contratProduits) {
		this.contratProduits = contratProduits;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}


	@Override
	public String toString() {
		return "Contrat [numero=" + numero + ", description=" + description + ", dateDebut=" + dateDebut + ", dateFin="
				+ dateFin + ", status=" + status + ", contratProduits=" + contratProduits + ", client=" + client.getEmail() + "]";
	}

	

}
