package web.FirstSecurityApp.models;

import jakarta.persistence.Entity;

@Entity
public class Role {
    private int id;
    private String name;
    private String description;
}
