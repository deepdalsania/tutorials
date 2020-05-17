def letter_freq(text):
    res = {}
    for letter in text:
        if letter not in res:
            res[letter] = 0
        res[letter] += 1
    return res


print(letter_freq("good morning"))
