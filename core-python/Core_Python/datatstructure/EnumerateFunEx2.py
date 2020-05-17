def skip_elements(elements):
    '''new_lst = []
    for k, v in enumerate(elements):
        if k % 2 == 0:
            new_lst.append(v)
    return new_lst '''
    ''' list comprehension '''
    return [v for k,v in enumerate(elements) if k % 2 == 0]

print(skip_elements(["a", "b", "c", "d", "e", "f", "g"]))  # Should be ['a', 'c', 'e', 'g']
print(skip_elements(
    ['Orange', 'Pineapple', 'Strawberry', 'Kiwi', 'Peach']))  # Should be ['Orange', 'Strawberry', 'Peach']
