package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
@Entity
public class EventCategory extends AbstractEntity {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private String contactEmail;
    private EventType type;

    public EventCategory(String name, String description, String contactEmail, EventType type) {
        super(name, description, contactEmail, type);
    }

    public EventCategory(){

    }

}
