#
# This class represents the Database in which resources will be stored.
#
class Database:

    #
    # key -> name of the resource ex. "person"
    # value -> the resource "person"
    #
    def __init__(self):
        self.resources = {}

    def get_resources(self):
        return self.resources

    def hello_world(self):
        return "Hello world"