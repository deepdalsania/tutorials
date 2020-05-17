import sys
import os


# Add Celsius class implementation below.
from builtins import print


class Celsius(object):
    def __get__(self, instance, owner):
        print('c : ',float(self.__celsius))
        return float(self.__celsius)
    def __set__(self, instance, value):
        print("i : ",instance)
        print("v : ",value)
        self.__celsius = value
        self.__fahrenheit = 32 + 9 * value  / 5


# Add temperature class implementation below.
class Temperature(object):
    celsius=Celsius()
    #print('tc : ',celsius)
    def __init__(self,fahrenheit):
        print('f : ',fahrenheit)
        self.fahrenheit=fahrenheit
        self.celsius= 5 * (fahrenheit-32)/9

t1 = Temperature(32)
print(t1.fahrenheit, t1.celsius)
t1.celsius=0
print(t1.fahrenheit, t1.celsius)

'''class Celsius:

    def __get__(self, instance, owner):
        return 5 * (instance.fahrenheit - 32) / 9

    def __set__(self, instance, value):
        instance.fahrenheit = 32 + 9 * value / 5


class Temperature:

    celsius = Celsius()

    def __init__(self, initial_f):
        self.fahrenheit = initial_f


t1 = Temperature(32)
print(t1.fahrenheit,t1.celsius)
t1.celsius = 0
print(t1.fahrenheit,t1.celsius)'''