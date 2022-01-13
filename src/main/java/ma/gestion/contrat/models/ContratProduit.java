package ma.gestion.contrat.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class ContratProduit {
	@EmbeddedId
	private ContratProduitKey id;

	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@MapsId("contrat")
	@JoinColumn(name = "contrat")
	private Contrat contrat;

	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@MapsId("produit")
	@JoinColumn(name = "produit")
	private Produit produit;
	
	private int quantite;
	private float montant;
	
	public ContratProduit() {

	}

	public ContratProduitKey getId() {
		return id;
	}

	public void setId(ContratProduitKey id) {
		this.id = id;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
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
