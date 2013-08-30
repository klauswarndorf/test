/**
 *
 */
package com.yoc.gaming.publisher_webservice.entities;

import java.io.Serializable;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

/**
 * @author jpenschuck
 *
 */
@PersistenceCapable
@XmlRootElement
@CsvRecord( separator = ",", isOrdered = true )
public class Publisher implements Serializable{

    /**
     * serial id
     */
    private static final long serialVersionUID = 1L;

    @PrimaryKey
    @Persistent(valueStrategy=IdGeneratorStrategy.INCREMENT)
    @DataField(pos = 1, position = 1)
    private long id;
    private String name;

    public void publisher() {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
