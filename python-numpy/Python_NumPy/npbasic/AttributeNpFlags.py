import numpy as np

# Information about the memory layout of the array.

# The flags object can be accessed dictionary-like (as in a.flags['WRITEABLE']), or by using
# lowercased attribute names (as in a.flags.writeable). Short flag names are only supported
# in dictionary access.

a = np.arange(10)
# The data is in a single, C-style contiguous segment
print("Flags Attribute C_CONTIGUOUS : ",a.flags.c_contiguous)
# The data is in a single, Fortran-style contiguous segment
print("Flags Attribute F_CONTIGUOUS : ",a.flags.f_contiguous)
# The array owns the memory it uses or borrows it from another object
print("Flags Attribute OWNDATA : ",a.flags.owndata)
# The data area can be written to. Setting this to False locks the data, making it read-only
print("Flags Attribute WRITEABLE : ",a.flags.writeable)
# The data and all elements are aligned appropriately for the hardware
print("Flags Attribute ALIGNED : ",a.flags.aligned)
# This array is a copy of some other array. When this array is deallocated, the base array
# will be updated with the contents of this array
print("Flags Attribute WRITEBACKIFCOPY  : ",a.flags.writebackifcopy)


