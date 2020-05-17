''' The format method returns a copy of the string where the {} placeholders
    have been replaced with the values of the variables. These variables are
    converted to strings if they weren't strings already. Empty placeholders
    are replaced by the variables passed to format in the same order. '''

# "base string with {} placeholders".format(variables)

example = "format() method"

formatted_string = "this is an example of using the {} on a string".format(example)

print(formatted_string)

"""Outputs:
this is an example of using the format() method on a string
"""

''' If the placeholders indicate a number, they’re replaced by the variable
    corresponding to that order (starting at zero). '''

# "{0} {1}".format(first, second)

first = "apple"
second = "banana"
third = "carrot"

formatted_string = "{0} {2} {1}".format(first, second, third)

print(formatted_string)

"""Outputs:
apple carrot banana
"""

''' If the placeholders indicate a field name, they’re replaced by the 
    variable corresponding to that field name. This means that parameters 
    to format need to be passed indicating the field name. '''
# "{var1} {var2}".format(var1=value1, var2=value2)

#"{:exp1} {:exp2}".format(value1, value2)


''' before : its shows expression number if we use {:d} this expression instead
    of {1:.0f} it will raise the ValueError: Unknown format code 'd' for 
    object of type 'float' '''
print('{1:.0f} and {0:.2f}'.format(410.1225,10.5))