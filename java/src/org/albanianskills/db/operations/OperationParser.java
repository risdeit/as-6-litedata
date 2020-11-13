package org.albanianskills.db.operations;

import org.albanianskills.db.models.Database;
import org.albanianskills.db.utils.InvalidOperationException;

/**
 * This class has the responsibility to retrieve the command
 * entered by the user ex. CREATE RESOURCE person(id_PK,name,surname,age);
 * and execute the logic to interpret the command and create the corresponding
 * operation object. In this example this class would create a CreateResourceOperation
 * which then would be used to run its execute() method that applies the changes
 * in the database.
 */
public class OperationParser {

    private OperationParser() {
        throw new RuntimeException("OperationParser cannot be instantiated");
    }

    /**
     * @param command Command received by the input file
     * @param db Database instance that will be passed to the operations
     * @return Operation which corresponds to that command
     */
    public static Operation parseCommand(String command, Database db) {
        if(command.startsWith("Say hello")) {
            return getHelloWorldOperation(db);
        }
        throw new InvalidOperationException();
    }

    private static Operation getHelloWorldOperation(Database db) {
        return new HelloWorldOperation(db);
    }
}
