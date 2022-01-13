package ma.gestion.contrat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.gestion.contrat.models.Client;

@Repository
public interface IClient extends JpaRepository<Client,Integer> {

}
