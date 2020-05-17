''' We can use any immutable data type (numbers , booleans,strings , tuples)
    as key and values can be of any data type '''

if __name__ == "__main__":
    file_counts = {"csv":14, "cef":15, "json":20}
    ''' dictionary are mutable '''
    print("Type : ",type(file_counts))
    print("JSON file counts : ",file_counts["json"])
    print("Check PNG file is exist in dictionary : ","png" in file_counts)
    file_counts["cfg"] = 10
    print("After adding CFG file count in dictionary : ",file_counts)
    file_counts["json"] = 21
    ''' When you use a key that already exists to set a value, the value that was 
        already paired with that key is replaced '''
    print("After adding a existing JSON count : ",file_counts)
    if "csv" in file_counts:
        del file_counts["csv"]
        print("After delete using all three methods : ",file_counts)
    print("Length of dictionary : ",len(file_counts))
    print("Get value of specified key : ",file_counts.get("json"))
    extra_files = {"svg":2,"txt":4}
    file_counts.update(extra_files)
    ''' updates the dictionary with the items coming from the other dictionary
        Existing entries will be replaced; new entries will be added. '''
    print("After update file_counts : ",file_counts)
    ''' removes all the items '''
    #file_counts.clear()
