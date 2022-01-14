package ma.gestion.contrat.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Devis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code;
	private String libelle;
	
	
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
	
	
	
}