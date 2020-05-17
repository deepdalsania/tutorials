''' is_power_of function return whether the number is a power of the given
    base.Note: base is assumed to be a positive number.'''
def is_power_of(number, base):
  # Base case: when number is smaller than base.
  if (number < base) and (number == 1):
    # If number is equal to 1, it's a power (base**0).
    return True
  elif (number == 0):
    return False
  else:
    number = number / base
  # Recursive case: keep dividing number by base.
  return is_power_of(number,base)

print(is_power_of(8,2)) # Should be True
print(is_power_of(64,4)) # Should be True
print(is_power_of(70,10)) # Should be False