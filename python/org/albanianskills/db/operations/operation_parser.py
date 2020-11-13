# This class has the responsibility to retrieve the command
# entered by the user ex. CREATE RESOURCE person(id_PK,name,surname,age);
# and execute the logic to interpret the command and create the corresponding
# operation object. In this example this class would create a CreateResourceOperation
# which then would be used to run its execute() method that applies the changes
# in the database.
#
from org.albanianskills.db.operations.hello_world_operation import HelloWorldOperation
from org.albanianskills.db.utils.invalid_operation_exception import InvalidOperationException


class OperationParser:

    @staticmethod
    def parse_command(command, db):
        if str(command).startswith("Say hello"):
            return HelloWorldOperation(db)

        raise InvalidOperationException("Invalid Operation")
