package ma.gestion.contrat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ma.gestion.contrat.models.DevisProduit;
import ma.gestion.contrat.models.DevisProduitkey;

@Repository
public interface IDevisProduit extends JpaRepository<DevisProduit, DevisProduitkey>{

	@Query(value = "SELECT * FROM devis_produit  WHERE devis = ?1", nativeQuery = true)
	List<DevisProduit> findByDevisId(Integer id);
}
