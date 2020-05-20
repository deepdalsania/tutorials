''' Fill in the code to check if the text passed includes a possible U.S. zip code,
    formatted as follows: exactly 5 digits, and sometimes, but not always, followed
    by a dash with 4 more digits. The zip code needs to be preceded by at least one
    space, and cannot be at the start of the text. '''

import re
def check_zip_code (text):
  result = re.search(r" (\d{5})([- ])?(\d{4})?", text)
  return result != None

print(check_zip_code("The zip codes for New York are 10001 thru 11104.")) # True
print(check_zip_code("90210 is a TV show")) # False
print(check_zip_code("Their address is: 123 Main Street, Anytown, AZ 85258-0001.")) # True
print(check_zip_code("The Parliament of Canada is at 111 Wellington St, Ottawa, ON K1A0A9.")) # False