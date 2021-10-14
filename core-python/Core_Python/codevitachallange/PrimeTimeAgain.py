"""
Here on earth, our 24-hour day is composed of two parts, each of 12hours. Each hour in each part has a corresponding hour in the other partseparated by 12 hours: the hour essentially measures the duration sincethe start of the day part. For example, 1 hour in the first part of the day is
equivalent to 13, which is 1 hour into the second part of the day.Now, consider the equivalent hours that are both prime numbers. We have 3 such instances for a 24-hour 2-part day:

5~17
7~19
11~23

Accept two natural numbers D, P >1 corresponding respectively to number
of hours per day and number of parts in a day separated by a space. D
should be divisible by P, meaning that the number of hours per part (D/P)
should be a natural number. Calculate the number of instances of
equivalent prime hours. Output zero if there is no such instance.

Note that we require each equivalent hour in each part in a day to be a prime number.
Example:

Input: 24 2
Output:3 (We have 3 instances of equivalent prime hours: 5~17, 7~19 and
11~23.)

Constraints:

10 <= D < 500
2 <= P < 50
"""

def isPrime(num):
    if num % 2 == 0:
        return False
    if num < 2:
        return False
    i = 2
    while (i * i <= num):
        if num % i == 0:
            return False
        i += 1
    return True


# def isPrime(num):
#     if num > 1:
#         # check for factors
#         for i in range(2, num):
#             if (num % i) == 0:
#                 return False
#         else:
#             return True
#     else:
#         return False


def get_list(x, y, interval, z):
    combined_list = [x]
    answer = x
    for i in range(y):
        # answer = x + interval
        if len(combined_list) <= y - 1:
            while answer <= z - interval:
                answer += interval
                combined_list.append(answer)

    combined_list = list(set(combined_list))
    return combined_list


def calculate_ans(a, b, hp):
    prime_in_p = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
                  103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199,
                  211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317,
                  331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443,
                  449, 457, 461, 463, 467, 479, 487, 491, 499]

    success = 0
    final_success = 0

    for i in range(len(prime_in_p)):
        if prime_in_p[i] <= hp:

            combined = get_list(prime_in_p[i], b, hp, a)
            for t in range(len(combined)):
                if isPrime(combined[t]):
                    success += 1
            if success == b:
                final_success += 1
                success=0
            else:
                success = 0

        else:
            break

    return final_success


D, P = list(map(int, input().split()))

hours_per_part = D // P

ans = calculate_ans(D, P, hours_per_part)
print(ans)
