package ma.gestion.contrat.models;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class DevisProduit {
	@EmbeddedId
	private DevisProduitkey id=new DevisProduitkey();
	
	@ManyToOne
	@MapsId("devis")
	@JoinColumn(name = "devis")
	private Devis devis;
	
	@ManyToOne
	@MapsId("produit")
	@JoinColumn(name = "produit")
	private Produit produit;
	
	private int quantite;
	private float montant;
	
	public DevisProduit() {
		
	}

	public DevisProduitkey getId() {
		return id;
	}

	public void setId(DevisProduitkey id) {
		this.id = id;
	}

	public Devis getDevis() {
		return devis;
	}

	public void setDevis(Devis devis) {
		this.devis = devis;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}
	
	
}
