from org.albanianskills.db.models.database import Database
from org.albanianskills.db.operations.operation_parser import OperationParser


def main():
    f = open("input.txt", "r")
    db = Database()

    for line in f:
        operation = OperationParser.parse_command(line, db)
        operation.execute()
        operation.revert()


if __name__ == "__main__":
    main()
