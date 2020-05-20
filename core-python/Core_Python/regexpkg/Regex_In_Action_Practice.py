import re

# find a country which name starts with A and end with a
print("1) Country Example : ",re.search(r"^A.*a$","Argentina"))
print("2) Country Example : ",re.search(r"^A.*a$","Azerbaijan"))
print("2) Country Example : ",re.search(r"^A.*a$","Australia"))

pattern = r"^[a-zA-Z_]\w*$"
print("1) Variable Validation : ",re.search(pattern,"_this_is_a_valid_variable_name"))
print("2) Variable Validation : ",re.search(pattern,"this isn't a valid variable name"))
print("3) Variable Validation : ",re.search(pattern,"my_variable1"))
print("4) Variable Validation : ",re.search(pattern,"2my_variable"))