names = ("foo","bar","buz","foo")
salary = (1000,2000,3000,1000)

print("Zipped list : ",list(zip(names,salary)))
# set is unstructured and only gives unique values and not maintain the order
print("Zipped set : ",set(zip(names,salary)))
# only gives unique values and maintain the order
print("Zipped dictionary : ",dict(zip(names,salary)))

