<?php

require_once 'HelloWorldOperation.php';

class OperationParser {

    /**
    * @param command Command received by the input file
    * @param db Database instance that will be passed to the operations
    * @return Operation which corresponds to that command
    */
    public function parseCommand($command, $db, $output) {
        if($this->startsWith($command, "Say hello")) {
            return $this->getHelloWorldOperation($db, $output);
        }
    }

    private function getHelloWorldOperation($db, $output) {
        $op = new HelloWorldOperation($db, $output);
        return $op;
    }

    private function startsWith($string, $startString) { 
        $len = strlen($startString); 
        return (substr($string, 0, $len) === $startString); 
    } 
}
