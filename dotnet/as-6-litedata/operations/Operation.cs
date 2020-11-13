using System;
using as_6_litedata.models;

namespace as_6_litedata.operations
{
    public abstract class Operation
    {

        /**
         * Name of operation.
         */
        private String name;

        /**
         * Every command should have a Receiver which will execute the logic
         * according to that command. In this case, the database is the Receiver.
         */
        protected Database db;

        protected Operation(String name, Database db)
        {
            this.name = name;
            this.db = db;
        }

        /**
        * This method executes the logic of the command.
        */
        public abstract void Execute();

        /**
        * This method reverts the changes made by execute().
        */
        public abstract void Revert();

        public String GetName()
        {
            return name;
        }
    }

}
