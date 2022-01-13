package ma.gestion.contrat.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DevisProduitkey implements Serializable{
	 @Column(name = "devis")
	 int devis;

	 @Column(name = "produit")
	 int produit;

	public DevisProduitkey() {
		
	}

	public int getDevis() {
		return devis;
	}

	public void setDevis(int devis) {
		this.devis = devis;
	}

	public int getProduit() {
		return produit;
	}

	public void setProduit(int produit) {
		this.produit = produit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + devis;
		result = prime * result + produit;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DevisProduitkey other = (DevisProduitkey) obj;
		if (devis != other.devis)
			return false;
		if (produit != other.produit)
			return false;
		return true;
	}
	


}
