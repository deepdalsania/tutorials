def cToF(c):
    return "That temperature doesn't make sense!" if c < -273.15 else (c*9/5)+32

print("Enter 4 temperatures in celsius for converting in fahrenheit : ")
lst = [int(input()),int(input()),int(input()),int(input())]
print([cToF(i) for i in lst])

