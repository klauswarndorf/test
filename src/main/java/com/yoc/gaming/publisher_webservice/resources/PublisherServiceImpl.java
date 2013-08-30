/**
 *
 */
package com.yoc.gaming.publisher_webservice.resources;

import com.yoc.gaming.publisher_webservice.daos.PublisherDAOImpl;
import com.yoc.gaming.publisher_webservice.entities.Publisher;

/**
 * @author jpenschuck
 *
 */
public class PublisherServiceImpl implements PublisherService {

    private PublisherDAOImpl publisherDAOImpl;

    public void setPublisherDAOImpl(PublisherDAOImpl publisherDAOImpl) {
        this.publisherDAOImpl = publisherDAOImpl;
    }

    @Override
    public Publisher getPublisher(String id) {
        return this.publisherDAOImpl.getPublisher(Long.parseLong(id));
    }

    @Override
    public Publisher addPublisher(Publisher publisher) {
        this.publisherDAOImpl.addPublisher(publisher);
        return publisher;
    }

}
