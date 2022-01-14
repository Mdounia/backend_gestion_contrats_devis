package ma.gestion.contrat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.gestion.contrat.models.Contrat;

@Repository
public interface IContrat extends JpaRepository<Contrat, Integer>{

}
