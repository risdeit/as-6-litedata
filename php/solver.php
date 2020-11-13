<?php

require_once 'operations/HelloWorldOperation.php';
require_once 'operations/OperationParser.php';
require_once 'models/Database.php';

$db = new Database();

$output = fopen(realpath(dirname(__FILE__) . "/output.txt"), "w") or die("Unable to open file!");

$input = fopen(realpath(dirname(__FILE__) . "/input.txt"), "r") or die("Unable to open file!");
while(!feof($input)) {
    $line = fgets($input);

    $parser = new OperationParser();
    $op = $parser->parseCommand($line, $db, $output);

    if($op != null) {
        $op->execute();
        $op->revert();
    }
    
}
  
fclose($input);