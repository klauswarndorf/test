package com.yoc.gaming.publisher_webservice.daos;

import com.yoc.gaming.publisher_webservice.entities.Publisher;

public interface PublisherDAO {

    public  Publisher getPublisher(long id);
    public  Publisher addPublisher(Publisher publisher);

}