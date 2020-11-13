from org.albanianskills.db.operations.operation import Operation


class HelloWorldOperation(Operation):

    def __init__(self, database):
        super().__init__("Hello World", database)

    def execute(self):
        print(self.database.hello_world())

    def revert(self):
        print(self.database.hello_world() + " reverted!")
        
