<?php

require_once(realpath(dirname(__FILE__) . '/../models/Database.php'));

abstract class Operation {

    /**
     * Name of operation.
     */
    private $name;

    /**
     * Every command should have a Receiver which will execute the logic
     * according to that command. In this case, the database is the Receiver.
     */
    public $db;

    public function __construct($name, $db)
    {
        $this->name = $name;
        $this->db = $db;    
    }

    /**
     * This method executes the logic of the command.
     */
    abstract public function execute();

    /**
     * This method reverts the changes made by execute().
     */
    abstract public function revert();

    public function get_name() {
        return $this->name;
    }
}
