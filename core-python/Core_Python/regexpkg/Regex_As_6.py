''' The multi_vowel_words function returns all words with 3 or more consecutive
    vowels (a, e, i, o, u). Fill in the regular expression to do that. '''

import re
def multi_vowel_words(text):
  pattern = r"\w+[aeiou]{3,}\w+"
  result = re.findall(pattern, text)
  return result

print(multi_vowel_words("Life is beautiful"))
# ['beautiful']

print(multi_vowel_words("Obviously, the queen is courageous and gracious."))
# ['Obviously', 'queen', 'courageous', 'gracious']

print(multi_vowel_words("The rambunctious children had to sit quietly and await their delicious dinner."))
# ['rambunctious', 'quietly', 'delicious']

print(multi_vowel_words("The order of a data queue is First In First Out (FIFO)"))
# ['queue']

print(multi_vowel_words("Hello world!"))
# []