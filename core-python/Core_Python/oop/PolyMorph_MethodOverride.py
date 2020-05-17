class Super:
    def sum(self,a,b):
        print("Addition using super class method : ",a+b)

class Sub(Super):
    ''' Here if we use pass and dont define sum then object of sub find show method in Sub if
        it don't find then search in super class'''
    # pass
    def sum(self,a,b):
        print("Addition using sub class method : ",a+b)

sub1 = Sub()
sub1.sum(int(input('Enter first number : ')),int(input('Enter second number : ')))