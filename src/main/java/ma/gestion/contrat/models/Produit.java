package ma.gestion.contrat.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String libelle;
	private String descriptrion;
	private float prix;
	@OneToMany(mappedBy = "produit")
	Set<ContratProduit> contratProduits;
	
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
	
	
	

}