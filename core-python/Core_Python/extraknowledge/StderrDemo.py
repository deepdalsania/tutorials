import sys

for i in ["This is demo","for","Stdout"]:
    sys.stdout.write(i+" ")
    try:
        i+=10
        print(i)
    except TypeError as e:
        sys.stderr.write("Type Miss match : ")