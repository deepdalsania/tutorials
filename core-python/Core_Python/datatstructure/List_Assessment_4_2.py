def pig_latin(text):
    say = ""
    # Separate the text into words
    words = text.split()
    for word in words:
        # Create the pig latin word and add it to the list
        # say = word[0] + "ay"
        ''' it will not add one extra white space at the end. Split gives the
            list and we can identify that if this entry is last entry or notv'''
        appended_word = word[1:] + word[0] + 'ay'
        say += appended_word +" " if word != words[-1] else appended_word
        # Turn the list back into a phrase
    return say


print(pig_latin("hello how are you"))  # Should be "ellohay owhay reaay ouyay"
print(pig_latin("programming in python is fun"))  # Should be "rogrammingpay niay ythonpay siay unfay"
