def get_word(sentence, n):
    # Only proceed if n is positive
    if n > 0:
        # Only proceed if n is not more than the number of words
        words = sentence.split()
        if n <= len(words):
            return (words[n-1])
    return ("")


print(get_word("This is a lesson about lists", 4))  # Should print: lesson
print(get_word("This is a lesson about lists", -4))  # Nothing
print(get_word("Now we are cooking!", 1))  # Should print: Now
print(get_word("Now we are cooking!", 5))  # Nothing
