package co.mobiwise.rest.service;

import java.util.List;

/**
 * Created by yusuf on 1/13/16.
 */
public interface GenericService<E,K> {

    void saveOrUpdate(E entity);
    List<E> getAll();
    E get(K id);
    void add(E entity);
    void update(E entity);
    void remove(E entity);
}