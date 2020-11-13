from abc import ABC, abstractmethod


class Operation(ABC):

    # Every command should have a Receiver which will execute the logic
    # according to that command. In this case, the database is the Receiver.
    def __init__(self, name, database):
        self.name = name
        self.database = database

    def execute(self):
        pass

    def revert(self):
        pass

    # Name of operation.
    def get_name(self):
        return self.name
