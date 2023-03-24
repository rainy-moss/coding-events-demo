package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
@Entity
public class Event extends AbstractEntity {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private String contactEmail;
    private EventType type;

    public Event(String name, String description, String contactEmail, EventType type) {
        super(name, description, contactEmail, type);
    }
    public Event() {
    }
}
