package ma.gestion.contrat.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String libelle;
	private String descriptrion;
	private float prix;
	@JsonIgnore
	@OneToMany(mappedBy = "produit")
	private Set<ContratProduit> contratProduits;
	@JsonIgnore
	@OneToMany(mappedBy = "produit")
	private Set<DevisProduit> devisProduits;	
	
	public Produit() {
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public String getDescriptrion() {
		return descriptrion;
	}


	public void setDescriptrion(String descriptrion) {
		this.descriptrion = descriptrion;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}


	public Set<ContratProduit> getContratProduits() {
		return contratProduits;
	}


	public void setContratProduits(Set<ContratProduit> contratProduits) {
		this.contratProduits = contratProduits;
	}


	public Set<DevisProduit> getDevisProduits() {
		return devisProduits;
	}


	public void setDevisProduits(Set<DevisProduit> devisProduits) {
		this.devisProduits = devisProduits;
	}


	@Override
	public String toString() {
		return "Produit [id=" + id + ", libelle=" + libelle + ", descriptrion=" + descriptrion + ", prix=" + prix
				+ ", contratProduits=" + contratProduits + ", devisProduits=" + devisProduits + "]";
	}
	
	
	

}
