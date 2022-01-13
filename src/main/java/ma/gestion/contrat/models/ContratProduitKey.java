package ma.gestion.contrat.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContratProduitKey implements Serializable{
	 @Column(name = "contrat")
	 int contrat;

	 @Column(name = "produit")
	 int produit;


	public ContratProduitKey() {

	}
	
	public ContratProduitKey(int contrat, int produit) {
		this.contrat = contrat;
		this.produit = produit;
	}

	public int getContrat() {
		return contrat;
	}

	public void setContrat(int contrat) {
		this.contrat = contrat;
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
		result = prime * result + contrat;
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
		ContratProduitKey other = (ContratProduitKey) obj;
		if (contrat != other.contrat)
			return false;
		if (produit != other.produit)
			return false;
		return true;
	}

	 
	 
}
