using System;
using as_6_litedata.models;
using as_6_litedata.operations;

namespace as_6_litedata
{
    class Program
    {
        static void Main(string[] args)
        {
            System.IO.File.WriteAllText("output.txt", "");

            string command = System.IO.File.ReadAllText("input.txt");

            Operation operation = OperationParser.ParseCommand(command, Database.GetInstance());
            operation.Execute();
            operation.Revert();
        }
    }
}
