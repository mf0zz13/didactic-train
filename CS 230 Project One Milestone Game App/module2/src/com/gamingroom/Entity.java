package com.gamingroom;

public class Entity {

    private long id;
    private String name;

    // Private Constructor to prevent accidental creation
    private Entity(){}

    // Overloaded Constructor that sets the id and name of entity
    public Entity(long id, String name) {
        Entity entity = this;
        entity.id = id;
        entity.name = name;
    }

    public long getId() { return id; }

    public String getName() { return name; }

    @Override
    public String toString() { return "Entity [id=" + id + ", name=" + name + "]";
    }
}
