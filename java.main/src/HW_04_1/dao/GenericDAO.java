package HW_04_1.dao;

import java.util.Collection;

public interface GenericDAO<T, ID> {

    void save(T entity);

    void update(T entity);

    T getById(ID id);

    void remove(T entity);

    Collection<T> getAll();
}
