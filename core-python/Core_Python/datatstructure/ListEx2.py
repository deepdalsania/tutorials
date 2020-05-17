''' The skip_elements function returns a list containing every other element
    from an input list, starting with the first element. Complete this
    function to do that, using the for loop to iterate through the input
    list. '''

# List comprehension: Range with conditional
''' it is very long methods also shoul be done by using '''
''' check this out : https://stackoverflow.com/questions/8865878/skipping-every-other-element-after-the-first'''
def skip_elements(elements):
    # Initialize variables
    new_list = []
    i = 0

    # Iterate through the list
    for i in range(len(elements)):
        # Does this element belong in the resulting list?
        if i % 2 == 0:
            # Add this element to the resulting list
            new_list.append(elements[i])
        # Increment i
        i+=2

    return new_list


print(skip_elements(["a", "b", "c", "d", "e", "f", "g"]))  # Should be ['a', 'c', 'e', 'g']
print(skip_elements(
    ['Orange', 'Pineapple', 'Strawberry', 'Kiwi', 'Peach']))  # Should be ['Orange', 'Strawberry', 'Peach']
print(skip_elements([]))  # Should be []
