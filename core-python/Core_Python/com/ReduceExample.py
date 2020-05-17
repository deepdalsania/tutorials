from functools import reduce

if __name__ == "__main__":
    # using reduce
    print(reduce(lambda x, y: x if x > y else y, [int(input()) for _ in range(int(input()))]))
