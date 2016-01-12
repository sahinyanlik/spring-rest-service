package co.mobiwise.rest.service;

import java.util.List;

/**
 * Created by yusuf on 1/13/16.
 */
public interface GenericService<E,K> {
    public void saveOrUpdate(E entity);
    public List<E> getAll();
    public E get(K id);
    public void add(E entity);
    public void update(E entity);
    public void remove(E entity);
}