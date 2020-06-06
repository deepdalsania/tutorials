import numpy as np

# it will print True for (i,j) = (0,0) , (1,1) , (2,2)
print("1) Array : ",np.fromfunction(lambda i, j: i == j, (3, 3), dtype=int))
# explanation of first row
# 1) i=0 and j= 0 so i+j=0
# 2) i=0 and j= 1 so i+j=1
# 3) i=0 and j= 2 so i+j=2
# explanation of second row
# 1) i=1 and j=0 so i+j=1
# 1) i=1 and j=1 so i+j=2
# 1) i=1 and j=2 so i+j=3
# so on ....
print("2) Array : ",np.fromfunction(lambda i, j: i + j, (3, 3), dtype=int))