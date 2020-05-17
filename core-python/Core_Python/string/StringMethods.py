s1 = "This is Sample String1"
s2 = "this string Is Only for ß Testing purpose"
s3 = "this Is for ß testing"
s4 = "I am a cyberpunk"
s5 = "I\tam\ta\tsoftware\ttester\nalso \rI am a \tdeveloper"
s6 = "       I love python        "
s7 = "I love python,java,ruby,scala"
s8 = "python,java,ruby,scala"
s9 = "python\njava\rruby\vscala"
s10 = "python\njava\nruby\nscala"
s11 = "python"
s12 = "123"
tup = ('1','2','3','4')
lst = ['1','2','3','4']
sep = "-"
name = "Foo"
like = "Python"
designation = "Software Developer"
print("1) capitalize : ",s1.capitalize())
# ß is a lower case in greek
print("2) lower : ",s2.lower())
# convert into lower case using casefold
print("3) casefold for lower case : ",s1.casefold())
# ß converts into ss
print("4) casefold : ",s2.casefold())
# if we are not passing fillchar parameter then it takes whitespace
# The original string is returned if width is less than or equal to len(s) eg. len of str is 16 s4.center(4) return original string.
print("5) center with width parameter : ",s4.center(20))
# the length of str is 16 then it adds @ from left to right 5 @ will add 3 for right and 2 for left
print("6) center with width and fillchar : ",s4.center(21,'@'))
print("7) count with substring : ",s1.count('s'))
print("8) count with substr and start,end : ",s1.count('s',0,4))
# default encoding scheme is utf-8
print("9) encode : ",s1.encode('utf-16'))
print("10) startwith using prefix only: ",s4.startswith('I'))
print("11) startwith using prefix and start,end : ",s4.startswith("cyber",3,7))
# same as endswith
# default tab is 8 and both return same result for I am a  developer because when \n or \r is there it sets to zero
print("12)deafault expandtabs :  ",s5.expandtabs())
print("13) modified expandtabs : ",s5.expandtabs(4))
print("14) find return lowest index of substr : ",s1.find('s')) # s1.find('s',3,8)
# My name is {0} I am a software {1} I like {2} and {} this is not valid either you have to use automatic or manual field specification
print("15) format a string using automatic field specification\n My name is {} I am a software {} I like {} and {}".format("deep","developer","python","java"))
print("16) format a string using manual field specification\n My name is {0} I am a software {1} I like {2} and {3}".format("deep","developer","python","java"))
print("16a) format a string using variable name\n My name is {n} I like {lang} I am a {pos}".format(n=name,pos=designation,lang=like))
print("17) lstrip remove char from left :  ",s6.lstrip())
print("17) rstrip remove char from right :  ",s6.rstrip())
# s1.replace('S','s',1) replace only 1st occurrences
print("18) replace all occurrences  : ",s1.replace('S','s'))
print("19) partition : ",s7.partition(','))
# rpartiotion partition from right
print("20) rpartition : ",s7.rpartition(','))
# rfind start finding from right
print("21) rfind : ",s1.rfind('s'))
# same as find but find return -1 if not found but index return error
print("22) index : ",s1.index('s')) # rindex also there
print("23) split and get all string as list  : ",s8.split(sep=','))
print("23) split and get specific string   : ",s8.split(',')[0])
print("24) split with maxsplit params : ",s8.split(sep=',',maxsplit=2))
print("25) rsplit : ",s8.rsplit(',',2))
#keepends default False
print("26) splitlines : ",s9.splitlines())
print("27) splitlines with keepends : ",s9.splitlines(keepends=True))
print("28) split : ",s10.split('\n'))
print("29) strip : ",s6.strip())
print("30) swapcase : ",s1.swapcase())
print("30)  that it is not necessarily true that s.swapcase().swapcase() == s : ",s1.swapcase().swapcase() == s1)
print("31) title : ","power of python".title())
print("33) join 1 : ",s11.join(s12))
print("34) join 2 : ",s12.join(s11))
print("35) join list : ",sep.join(lst))
print("36) join tuple : ",sep.join(tup))






