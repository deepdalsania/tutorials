def convert_seconds(s):
    h = s // 3600
    m = (s - h * 3600) // 60
    rs = (s - h * 3600 - m * 60)
    return h , m ,rs

output = convert_seconds(5000)
print("Type : ",type(output))
print("Output : ",output)
''' unpacking tuple'''
h , m , s = convert_seconds(5000)
print("Hours : {} Minutes : {} Seconds : {}".format(h,m,s))
