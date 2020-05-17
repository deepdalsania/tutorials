from math import sqrt
'''  the sum of all the divisors of a number, without including it. A 
     divisor is a number that divides into another without a remainder. '''

def sum_divisors(n):
    if n == 0:
        return 0
    else:
        sum = 0
    factor = 2
    while factor <= (sqrt(n)):
        if n % factor == 0:
            if factor == (n / factor):
                sum += factor
            else:
                sum += (factor + n / factor)
        factor+=1
    return int(sum+1)

print(sum_divisors(0))
# 0
print(sum_divisors(3))  # Should sum of 1
# 1
print(sum_divisors(36))  # Should sum of 1+2+3+4+6+9+12+18
# 55
print(sum_divisors(102))  # Should be sum of 2+3+6+17+34+51
# 114
