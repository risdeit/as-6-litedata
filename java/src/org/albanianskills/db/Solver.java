package org.albanianskills.db;

import org.albanianskills.db.models.Database;
import org.albanianskills.db.operations.Operation;
import org.albanianskills.db.operations.OperationParser;

import java.io.*;

public class Solver {

    public static void main(String[] args) throws IOException {

        // initializing the file to read the commands
        File file = new File("hello_world.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        // print the results in the output file
        PrintStream fileStream = new PrintStream("output.txt");
        System.setOut(fileStream);

        // get the database instance
        Database db = Database.getInstance();

        // read the input line by line and parse the commands
        String line;
        while ((line = br.readLine()) != null) {
            Operation operation = OperationParser.parseCommand(line, db);
            operation.execute();
            operation.revert();
        }
    }

}
