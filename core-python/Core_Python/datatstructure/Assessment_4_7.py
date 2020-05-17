''' Use a dictionary to count the frequency of letters in the input string.
    Only letters should be counted, not blank spaces, numbers, or
    punctuation. Upper case should be considered the same as lower case.
    For example, count_letters("This is a sentence.") should return
    {'t': 2, 'h': 1, 'i': 2, 's': 3, 'a': 1, 'e': 3, 'n': 2, 'c': 1}. '''

def count_letters(text):
    result = {}
    # Go through each letter in the text
    for letter in text:
        # Check if the letter needs to be counted or not
        if letter.upper() >='A' and letter.upper() <= 'Z':
            if letter.lower() not in result:
                result[letter.lower()] = 0
            # Add or increment the value in the dictionary
            result[letter.lower()] += 1
    return result


print(count_letters("AaBbCc"))
# Should be {'a': 2, 'b': 2, 'c': 2}

print(count_letters("Math is fun! 2+2=4"))
# Should be {'m': 1, 'a': 1, 't': 1, 'h': 1, 'i': 1, 's': 1, 'f': 1, 'u': 1, 'n': 1}

print(count_letters("This is a sentence."))
# Should be {'t': 2, 'h': 1, 'i': 2, 's': 3, 'a': 1, 'e': 3, 'n': 2, 'c': 1}
