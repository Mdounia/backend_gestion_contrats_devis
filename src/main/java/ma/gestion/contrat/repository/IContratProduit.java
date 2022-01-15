package ma.gestion.contrat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ma.gestion.contrat.models.ContratProduit;
import ma.gestion.contrat.models.ContratProduitKey;

@Repository
public interface IContratProduit extends JpaRepository<ContratProduit, ContratProduitKey>{
	
	@Query(value = "SELECT * FROM ContratProduit cp WHERE cp.contrat.id = ?1", nativeQuery = true)
	List<ContratProduit> findByContractId(Integer id);

}
