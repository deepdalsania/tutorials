if __name__ == "__main__":
    file_counts = {"csv":14, "cef":15, "json":20}
    print("Only keys with default iteration : ")
    for ext in file_counts:
        ''' it gives the keys '''
        print(ext)
    print("items() to use iterating over key and value both : ")
    for ext , count in file_counts.items():
        print("There are {} files with the .{} extension".format(count,ext))
    print("Only keys with keys() : ",file_counts.keys())
    print("Only values with values() : ",file_counts.values())
    print("Only values with iteration values() : ")
    for vals in file_counts.values():
        print(vals)