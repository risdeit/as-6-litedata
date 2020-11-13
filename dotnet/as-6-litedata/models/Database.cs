using System;
using System.Collections.Generic;

namespace as_6_litedata.models
{

    /**
     * This class represents the Database in which resources will be stored.
     */
    public class Database
    {

        private static Database instance;

        /**
         * key -> name of the resource ex. "person"
         * value -> the resource "person"
         */
        private Dictionary<string, Resource> resources;

        private Database()
        {
            resources = new Dictionary<string, Resource>();
        }

        /**
         * Use this method to get the Database instance.
         * @return Database instance
         */
        public static Database GetInstance()
        {
            if (instance == null)
                instance = new Database();
            return instance;
        }

        public Dictionary<string, Resource> GetResources()
        {
            return resources;
        }

        public String HelloWorld()
        {
            return "Hello world";
        }
    }

}
