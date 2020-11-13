class HelloWorldOperation {
    /**
     * Name of operation.
     * 
     * Every command should have a Receiver which will execute the logic
     * according to that command. In this case, the database is the Receiver.
     */

    HelloWorldOperation(db) {
        this.name = "Hello World";
        this.db = db;
    }

    /**
     * This method executes the logic of the command.
     */
    execute() {
        var fs = require('fs');
        fs.appendFile('output.txt', 'Hello World!\n', function(err) {
            if (err) return console.log(err);
        });
    }

    /**
     * This method reverts the changes made by execute().
     */
    revert() {
        var fs = require('fs');
        fs.appendFile('output.txt', 'Hello World reverted!\n', function(err) {
            if (err) return console.log(err);
        });
    }


    getName() {
        return this.name;
    }
}

module.exports = HelloWorldOperation