"""
Brides-to-be are organized such that the most eligible bachelorette will get first chance to choose her Groom, only then, the next most eligible bachelorette will get a chance to choose her Groom. If the initial most eligible bachelorette does not get a Groom of her choice, none of the Brides-to-be have any chance at all to get married. So, unless a senior bachelorette is out of the "queue", the junior bachelorette does not get a chance to select her Groom-to-be. The Initial state of Grooms-to-be is such that most eligible bachelor is at the head of the "queue". The next most eligible bachelor is next in the queue so on and so forth. Now everything hinges on the choice of the bachelorette. The most eligible bachelorette will now meet the most eligible bachelor. If bachelorette selects the bachelor, both, the bachelorette and the bachelor are now Bride and Groom respectively and will no longer be a part of the Swayamvar activity. Now, the next most eligible bachelorette will get a chance to choose her Groom. Her first option is the next most eligible bachelor (relative to initial state) , If the most eligible bachelorette passes the most eligible bachelor, the most eligible bachelor now moves to the end of the queue. The next most eligible bachelor is now considered by the most eligible bachelorette. Selection or Passing over will have the same consequences as explained earlier. If most eligible bachelorette reaches the end of bachelor queue, then the Swayamvar is over and nobody can get married. Given a mix of Selection or Passing over, different pairs will get formed.

The selection criteria are as follows: Each person either drinks rum or mojito. Bride will choose groom only if he drinks the same drink as her.

Constraints

1<= N <= 10^4

Input Format

First line contains one integer N, which denotes the number of brides and grooms taking part in the swayamvar. Second line contains a string in lowercase, of length N containing initial state of brides-to-be. Third line contains a string in lowercase, of length N containing initial state of grooms-to-be. Each string contains only lowercase 'r' and 'm' stating person at that index drinks "rum"(for 'r') or mojito(for 'm').

Output

Output a single integer denoting the number of pairs left unmatched.
"""

n = int(input())

f = input()
m = input()

cnt_r = m.count('r')
cnt_m = m.count('m')

lst1 = [i for i in f]

for i in f:
    if i == 'r':
        if cnt_r == 0:
            print(len(lst1, end=''))
            break
        cnt_r -= 1
        lst1.pop(0)

    elif i == 'm':
        if cnt_m == 0:
            print(len(lst1), end='')
            break
        cnt_m -= 1
        lst1.pop(0)
else:
    print(0, end='')
