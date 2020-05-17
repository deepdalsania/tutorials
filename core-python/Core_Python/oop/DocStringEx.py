class Person:
    def __init__(self, name):
        self.name = name

    def greeting(self):
        """Outputs a message with the name of the person"""
        print("Hello! My name is {name}.".format(name=self.name))


p = Person("foo")
help(p)
