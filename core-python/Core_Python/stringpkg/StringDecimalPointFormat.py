def to_celsius(x):
    return (x-32)*5/9

for i in range(0,101,10):
    print("{:>3} F | {:>6.2f} C".format(i,to_celsius(i)))

''' First Expression : numbers to be aligned to the right for a total of three
                       spaces ( > : right , < : left , and ^ : centre )
    Second Expression : number to always have exactly two decimal places and
                        we want to align it to the right at siz spaces '''
