using System;
using as_6_litedata.models;

namespace as_6_litedata.operations
{
    public class HelloWorldOperation : Operation
    {

        public HelloWorldOperation(Database db) : base("Hello World", db)
        {
        
        }

        public override void Execute()
        {
            System.IO.File.AppendAllText("output.txt", db.HelloWorld() + "\n");
            
        }

        public override void Revert()
        {
            System.IO.File.AppendAllText("output.txt", db.HelloWorld() + " reverted!\n");

        }
    }

}
