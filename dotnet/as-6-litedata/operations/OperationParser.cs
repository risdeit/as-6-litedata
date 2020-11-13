using System;
using System.Collections.Generic;
using as_6_litedata.models;

namespace as_6_litedata.operations
{
    /**
  * This class has the responsibility to retrieve the command
  * entered by the user ex. CREATE RESOURCE person(id_PK,name,surname,age);
  * and execute the logic to interpret the command and create the corresponding
  * operation object. In this example this class would create a CreateResourceOperation
  * which then would be used to run its execute() method that applies the changes
  * in the database.
  */
    public class OperationParser
    {

        private OperationParser()
        {
        }

        /**
         * @param command Command received by the input file
         * @param db Database instance that will be passed to the operations
         * @return Operation which corresponds to that command
         */
        public static Operation ParseCommand(String command, Database db)
        {
            if (command.StartsWith("Say hello"))
            {
                return GetHelloWorldOperation(db);
            }
            return null;
        }

        private static Operation GetHelloWorldOperation(Database db)
        {
            return new HelloWorldOperation(db);
        }
    }

}
