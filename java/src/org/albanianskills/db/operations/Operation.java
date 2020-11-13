package org.albanianskills.db.operations;

import org.albanianskills.db.models.Database;

public abstract class Operation {

    /**
     * Name of operation.
     */
    private final String name;

    /**
     * Every command should have a Receiver which will execute the logic
     * according to that command. In this case, the database is the Receiver.
     */
    protected final Database db;

    protected Operation(String name, Database db) {
        this.name = name;
        this.db = db;
    }

    /**
     * This method executes the logic of the command.
     */
    public abstract void execute();

    /**
     * This method reverts the changes made by execute().
     */
    public abstract void revert();

    public String getName() {
        return name;
    }
}
