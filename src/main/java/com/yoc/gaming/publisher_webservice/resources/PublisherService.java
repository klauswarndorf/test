package com.yoc.gaming.publisher_webservice.resources;

import com.yoc.gaming.publisher_webservice.entities.Publisher;

public interface PublisherService {

    public Publisher getPublisher(String id);

    public Publisher addPublisher(Publisher publisher);
}