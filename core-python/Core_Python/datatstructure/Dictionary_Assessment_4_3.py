''' The dict.update method updates one dictionary with the items coming from
    the other dictionary, so that existing entries are replaced and new
    entries are added. What is the content of the dictionary “wardrobe“
    at the end of the following code?'''

wardrobe = {'shirt': ['red', 'blue', 'white'], 'jeans': ['blue', 'black']}
new_items = {'jeans': ['white'], 'scarf': ['yellow'], 'socks': ['black', 'brown']}
wardrobe.update(new_items)
''' it overrides the jeans key and its value '''