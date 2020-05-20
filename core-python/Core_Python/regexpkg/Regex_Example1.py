''' Fill in the code to check if the text passed contains the vowels a, e and i, with
    exactly one occurrence of any other character in between. '''

import re
def check_aei (text):
  result = re.search(r"a.e.i", text)
  return result != None

print(check_aei("academia")) # True
print(check_aei("aerial")) # False
print(check_aei("paramedic")) # True