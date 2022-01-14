package ma.gestion.contrat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.gestion.contrat.models.User;


@Repository
public interface IUser extends JpaRepository<User, String> {
}
