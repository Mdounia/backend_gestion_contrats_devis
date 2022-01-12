package ma.gestion.contrat.dao;

import java.util.List;
import java.util.Optional;

public interface IDaoCrudsOperations<T> {

    public T add(T obj) ;

    public void delete(int id);

    public T update(T obj, int id);

    public List<T> findAll();

    public Optional<T> findById(int id);
}
