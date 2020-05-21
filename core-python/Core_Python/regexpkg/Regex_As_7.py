''' The transform_comments function converts comments in a Python script into those
    usable by a C compiler. This means looking for text that begins with a hash mark
    (#) and replacing it with double slashes (//), which is the C single-line comment
    indicator. For the purpose of this exercise, we'll ignore the possibility of a
    hash mark embedded inside of a Python command, and assume that it's only used to
    indicate a comment. We also want to treat repetitive hash marks (##), (###), etc.
    , as a single comment indicator, to be replaced with just (//) and not (#//) or
    (//#). Fill in the parameters of the substitution method to complete this
    function: '''

import re
def transform_comments(line_of_code):
  result = re.sub(r"#{1,}",r"//",line_of_code)
  return result

print(transform_comments("### Start of program"))
# Should be "// Start of program"
print(transform_comments("  number = 0   ## Initialize the variable"))
# Should be "  number = 0   // Initialize the variable"
print(transform_comments("  number += 1   # Increment the variable"))
# Should be "  number += 1   // Increment the variable"
print(transform_comments("  return(number)"))
# Should be "  return(number)"
