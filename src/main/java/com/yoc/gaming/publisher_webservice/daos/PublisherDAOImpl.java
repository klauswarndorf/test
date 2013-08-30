package com.yoc.gaming.publisher_webservice.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.yoc.gaming.publisher_webservice.entities.Publisher;

public class PublisherDAOImpl implements PublisherDAO {

    private EntityManager entityManager;

    public PublisherDAOImpl() {
        this.entityManager = null;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Publisher getPublisher(long id) {
        Query q = entityManager.createQuery("SELECT x FROM Publisher", Publisher.class);
        List<Publisher> results = (List<Publisher>) q.getResultList();
        Publisher publisher = results.get(0);
        return publisher;
    }

    @Override
    public Publisher addPublisher(Publisher publisher) {
        Publisher publisher2= new Publisher();
        publisher2.setId(1);
        publisher2.setName("loool");
        this.entityManager.persist(publisher2);
        this.entityManager.flush();
        return publisher2;
    }
}
