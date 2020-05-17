def findExpense(data):
    a = input("Enter area to find expenditure : ")
    ex_dict = {}
    ex_dict[a] = []
    for _,vals in data.values():
        if vals['area'] == a:
            ex_dict[a].append(vals['expenditure'])
    return ex_dict
    # BY USING LIST COMPREHENSION
    '''ex_dict[a] = [vals['expenditure'] for _, vals in data.items() if vals['area'] == a]
    return ex_dict'''


print(findExpense({
    "1": {'area': 'Administration', 'expenditure': '315'},
    "2": {'area': 'Administration', 'expenditure': '120'},
    "3": {'area': None, 'expenditure': '314'},
    "4": {'area': 'Aids and appliances', 'expenditure': None},
    "5": {'area': 'Aids and appliances', 'expenditure': '12'},
    "6": {'area': 'Administration', 'expenditure': '110'},
    "7": {'area': 'Administration', 'expenditure': '300'}
}))