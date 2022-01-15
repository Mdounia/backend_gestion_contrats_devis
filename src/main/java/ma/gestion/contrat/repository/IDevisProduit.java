package ma.gestion.contrat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.gestion.contrat.models.DevisProduit;
import ma.gestion.contrat.models.DevisProduitkey;

@Repository
public interface IDevisProduit extends JpaRepository<DevisProduit, DevisProduitkey>{

}
