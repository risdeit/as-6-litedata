package org.albanianskills.db.operations;

import org.albanianskills.db.models.Database;

public class HelloWorldOperation extends Operation {

    public HelloWorldOperation(Database db) {
        super("Hello World", db);
    }

    @Override
    public void execute() {
        System.out.println(db.helloWorld());
    }

    @Override
    public void revert() {
        System.out.println(db.helloWorld() + " reverted!");
    }
}
