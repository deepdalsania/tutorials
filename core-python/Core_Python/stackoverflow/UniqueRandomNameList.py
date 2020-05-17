import random

print("Random Name Picker")

input_string = input("Input names: ")
if input_string == "exit":
    exit()
name_list = input_string.split()
print("Our contestants for this round are:", name_list)
s = int(input("Enter a Positive Sample Size : "))
print("Our winners are:", random.sample(name_list,k=s) if s <= len(name_list) else "Sample larger than population or is negative")