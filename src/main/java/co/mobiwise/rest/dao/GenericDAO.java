package co.mobiwise.rest.dao;

import java.util.List;

/**
 * Created by yusuf on 1/13/16.
 */
public interface GenericDAO<E, K> {

    public void add(E entity) ;
    public void saveOrUpdate(E entity) ;
    public void update(E entity) ;
    public void remove(E entity);
    public E find(K key);
    public List<E> getAll() ;
}
