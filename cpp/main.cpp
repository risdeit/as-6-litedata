#include<iostream>
#include<fstream>
#include <string>
#include <unordered_map>

using namespace std;

/**
 * This class represents a single row that will be inside of the Resource.
 * For example, a "Person" resource would store a row with his ID, name,
 * surname e.t.c.
 */
class Row
{
    
};

/**
 * This class represents a single Resource that will be stored
 * in the database. A database may contain many resources such
 * as: Person, Company, Dog e.t.c.
 */
class Resource
{
    
};

/**
 * This class represents the Database in which resources will be stored.
 */
class Database
{
private:
    /**
     * key -> name of the resource ex. "person"
     * value -> the resource "person"
     */
    unordered_map<string, Resource> resources;

public:
    Database();

    unordered_map<string, Resource> get_resources() { return resources; }

    string hello_world() {
        return "Hello world";
    }    
};

class HelloWorldOperation
{
    private:
        ofstream stream;

    public:
        /**
        * Name of operation.
        */
        string name;

        /**
        * Every command should have a Receiver which will execute the logic
        * according to that command. In this case, the database is the Receiver.
        */
        Database* db;

        HelloWorldOperation(string file_name) { 
            name = "Hello World";
            stream.open(file_name);
        }

        void execute() {
            stream<<db->hello_world()<<endl;
        }

        void revert() {
            stream<<db->hello_world()<<" reverted!"<<endl;
        }

        string get_name() { return name; }
};

class OperationParser {
    public: 
        static void parse_command(string command) {
            if (command.rfind("Say hello", 0) == 0) {
                HelloWorldOperation op("/your_path/output.txt");
                op.execute();
                op.revert();
                return ;
            }
        }
};

int main() {
    ifstream input;
    input.open("/your_path/input.txt");

    string line;
    if (input.is_open()) {
        while (getline(input,line)) {
            OperationParser().parse_command(line);
        }
        input.close();
    }

    return 0;
}