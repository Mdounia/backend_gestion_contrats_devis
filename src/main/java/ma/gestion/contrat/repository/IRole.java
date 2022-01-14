package ma.gestion.contrat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.gestion.contrat.models.Role;


@Repository
public interface IRole extends JpaRepository<Role, String> {

}
