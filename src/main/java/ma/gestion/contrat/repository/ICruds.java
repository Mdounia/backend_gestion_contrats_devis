package ma.gestion.contrat.repository;

import org.springframework.data.repository.CrudRepository;

public interface ICruds<T,D> extends CrudRepository<T,D> {

}
