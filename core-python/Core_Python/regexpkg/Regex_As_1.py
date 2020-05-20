''' The check_web_address function checks if the text passed qualifies as a top-level
    web address, meaning that it contains alphanumeric characters (which includes
    letters, numbers, and underscores), as well as periods, dashes, and a plus sign,
    followed by a period and a character-only top-level domain such as ".com", ".info",
    ".edu", etc. Fill in the regular expression to do that, using escape characters,
    wildcards, repetition qualifiers, beginning and end-of-line characters, and
    character classes. '''

import re
def check_web_address(text):
  pattern = r"^[\w\.\-\+]*$"
  result = re.search(pattern, text)
  return result != None

print(check_web_address("gmail.com")) # True
print(check_web_address("www@google")) # False
print(check_web_address("www.Coursera.org")) # True
print(check_web_address("web-address.com/homepage")) # False
print(check_web_address("My_Favorite-Blog.US")) # True
