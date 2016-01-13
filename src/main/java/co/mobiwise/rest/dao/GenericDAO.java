package co.mobiwise.rest.dao;

import java.util.List;

/**
 * Created by yusuf on 1/13/16.
 */
public interface GenericDAO<E, K> {

    /**
     *GenericDao interface contains common methods used by multiple dao classes.
     * Also, we are using Java generic concept in this interface.
     * E and K letters represent Model class
     *
     * add your entity.
     *
     * @param entity
     */
     void add(E entity) ;

    /**
     * Save or update your entity.
     *
     * @param entity
     */
     void saveOrUpdate(E entity) ;

    /**
     *
     * @param entity
     */
     void update(E entity) ;

    /**
     * Delete your entity.
     *
     * @param entity
     */
     void remove(E entity);

    /**
     * find your data with key from entity.
     *
     * @param key
     *
     * @return entity with key.
     */
     E find(K key);

    /**
     * get all data with a list.
     *
     * @return list
     */
     List<E> getAll() ;
}
