a = int(input('how many chocolates you want? '))
i = 1
av = 10
while i <= a:
    if i > av:
        print("Sorry, out of stoke")
        break;
    print("chocolate",i)
    i+=1
else:
    print("Enter a valid number")