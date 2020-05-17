''' First method for palindrome '''

def is_palindrome(input_string):
    new_string = input_string.split()
    new_string = "".join(new_string).lower()
    reverse_string = new_string[::-1]
    if new_string == reverse_string:
        return True
    return False

print(is_palindrome("Never Odd or Even"))  # Should be True
print(is_palindrome("abc"))  # Should be False
print(is_palindrome("kayak"))  # Should be True


''' Second method for palindrome '''

'''def is_palindrome(input_string):
	# We'll create two strings, to compare them
	new_string = ""
	reverse_string = ""
	# Traverse through each letter of the input string
	for temp_str in input_string:
		# Add any non-blank letters to the 
		# end of one string, and to the front
		# of the other string. 
		if temp_str != " ":
			new_string += temp_str.lower()
			reverse_string = temp_str.lower() + reverse_string
	# Compare the strings
	if new_string == reverse_string:
		return True
	return False

print(is_palindrome("Never Odd or Even")) # Should be True
print(is_palindrome("abc")) # Should be False
print(is_palindrome("kayak")) # Should be True '''