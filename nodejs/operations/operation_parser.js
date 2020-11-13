const HelloWorldOperation = require('./hello_world_operation.js')

/**
 * This class has the responsibility to retrieve the command
 * entered by the user ex. CREATE RESOURCE person(id_PK,name,surname,age);
 * and execute the logic to interpret the command and create the corresponding
 * operation object. In this example this class would create a CreateResourceOperation
 * which then would be used to run its execute() method that applies the changes
 * in the database.
 */
class OperationParser {

    OperationParser() {
        throw new RuntimeException("OperationParser cannot be instantiated");
    }

    /**
     * @param command Command received by the input file
     * @param db Database instance that will be passed to the operations
     * @return Operation which corresponds to that command
     */
    static parseCommand(command, db) {
        if (command.startsWith("Say hello")) {
            return this.getHelloWorldOperation(db);
        }
    }

    static getHelloWorldOperation(db) {
        return new HelloWorldOperation(db);
    }
}

module.exports = OperationParser