import numpy as np

# Return the floor of the input, element-wise.
# The floor of the scalar x is the largest integer i, such that i <= x. It is often denoted as \lfloor x \rfloor.

a = np.array([-2.8, -2.5, -0.3, 0.3, 1.6, 2.7, 3.0])
print("Floor : ",np.floor(a))