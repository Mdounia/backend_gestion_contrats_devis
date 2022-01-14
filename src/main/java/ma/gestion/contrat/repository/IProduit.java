package ma.gestion.contrat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.gestion.contrat.models.Produit;

@Repository
public interface IProduit extends JpaRepository<Produit, Integer>{
	
	
}
