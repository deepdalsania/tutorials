import decimal
import datetime

name = 'deep'
print('str format : ', f'My name is {name}.')
'''If a conversion is specified, the result of evaluating the expression is converted before
 formatting. Conversion '!s' calls str() on the result, '!r' calls repr(), and '!a' calls ascii().'''
print('!r : ', f'My name is {name!r}.')
print('repr : ', f'My name is {repr(name)}.')
'''The width is the minimum number of characters reserved for a formatted value.
 If the precision is for a numeric conversion then it sets the number of decimals 
 that will be included in the result, If the precision is for a string conversion 
 then it sets the maximum number of characters the formatted value may have'''
width = 20
precision = 6
value = decimal.Decimal("104.410104")
print('nested fields result : ', f"{value : {width}.{precision}}")
today = datetime.datetime(year=2020, month=4, day=9)
print('date : ', f'{today : %B %d, %Y}')
price = 4.10
tax = price * 1.04
print("Price is : {:.2f} and Tax is : {:.2f}".format(price, tax))

