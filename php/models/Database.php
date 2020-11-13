<?php

/**
 * This class represents the Database in which resources will be stored.
 */ 
class Database {
     /**
     * key -> name of the resource ex. "person"
     * value -> the resource "person"
     */
    private $resources;

    public function get_resources() {
        return $this->resources;
    }

    public function hello_world() {
        return "Hello world";
    }

}