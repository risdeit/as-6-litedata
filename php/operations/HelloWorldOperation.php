<?php

require_once 'Operation.php';

class HelloWorldOperation extends Operation {

    private $output;

    public function __construct($db, $output)
    {
        parent::__construct("Hello World", $db);
        $this->output = $output;
    }

    function execute() {
        fwrite($this->output, $this->db->hello_world() . "\n"); 
    }

    function revert() {
        fwrite($this->output, $this->db->hello_world() . " reverted!\n"); 
    }
}
