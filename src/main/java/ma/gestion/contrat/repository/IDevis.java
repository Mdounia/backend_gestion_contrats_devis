package ma.gestion.contrat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.gestion.contrat.models.Devis;

@Repository
public interface IDevis extends JpaRepository<Devis, Integer>{

}
