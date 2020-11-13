package org.albanianskills.db.models;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents the Database in which resources will be stored.
 */
public class Database {

    private static Database instance;

    /**
     * key -> name of the resource ex. "person"
     * value -> the resource "person"
     */
    private final Map<String, Resource> resources;

    private Database() {
        resources = new HashMap<>();
    }

    /**
     * Use this method to get the Database instance.
     * @return Database instance
     */
    public static Database getInstance() {
        if (instance == null)
            instance = new Database();
        return instance;
    }

    public Map<String, Resource> getResources() {
        return resources;
    }

    public String helloWorld() {
        return "Hello world";
    }
}
