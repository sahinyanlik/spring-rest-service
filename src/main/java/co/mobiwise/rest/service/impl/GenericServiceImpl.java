package co.mobiwise.rest.service.impl;

import co.mobiwise.rest.dao.GenericDAO;
import co.mobiwise.rest.service.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yusuf on 1/13/16.
 */
@Service
public abstract class GenericServiceImpl<E,K> implements GenericService<E,K> {

    private GenericDAO<E,K> genericDAO;

    public GenericServiceImpl(GenericDAO<E, K> genericDAO) {
        this.genericDAO = genericDAO;
    }
    public GenericServiceImpl(){

    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void saveOrUpdate(E entity) {
        genericDAO.saveOrUpdate(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public List<E> getAll() {
        return genericDAO.getAll();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public E get(K id) {
        return genericDAO.find(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void add(E entity) {
        genericDAO.add(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void update(E entity) {
        genericDAO.update(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void remove(E entity) {
        genericDAO.remove(entity);
    }
}