package ma.gestion.contrat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.gestion.contrat.models.Fournisseur;

@Repository
public interface IFournisseur extends JpaRepository<Fournisseur, Integer>{

}
