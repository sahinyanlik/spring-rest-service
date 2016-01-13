package co.mobiwise.rest.dao.impl;

import co.mobiwise.rest.dao.GenericDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
/**
 * Created by yusuf on 1/13/16.
 */
@SuppressWarnings("unchecked")
@Repository
public abstract class GenericDaoImpl<E, K extends Serializable> implements GenericDAO<E,K> {

    /**
     * SessionFactorys are immutable. The behaviour of a SessionFactory is
     * controlled by properties supplied at configuration time.
     * These properties are defined on Environment.
     */
    @Autowired
    private SessionFactory sessionFactory;

    protected Class<? extends E> daoType;

    /**
     * By defining this class as abstract, we prevent Spring from creating
     * instance of this class If not defined as abstract,
     * getClass().getGenericSuperClass() would return Object. There would be
     * exception because Object class does not hava constructor with parameters.
     */
    public GenericDaoImpl(){
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        daoType = (Class) pt.getActualTypeArguments()[0];
    }

    /**
     * get current session.
     *
     * @return current session from sessionFactory
     */
    protected Session currentSession(){
        return sessionFactory.getCurrentSession();
    }

    public void add(E entity) {
        currentSession().save(entity);

    }

    public void saveOrUpdate(E entity) {
        currentSession().saveOrUpdate(entity);

    }

    public void update(E entity) {
        currentSession().saveOrUpdate(entity);
    }

    public void remove(E entity) {
        currentSession().delete(entity);
    }

    public E find(K key) {
        return (E) currentSession().get(daoType, key);
    }

    public List<E> getAll() {
        return currentSession().createCriteria(daoType).list();
    }
}
