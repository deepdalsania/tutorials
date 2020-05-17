print("<< Custom Exception for checking age is valid for voting or not. >>")


class InvalidAgeError(Exception):
    ''' If we use this then we can get e.message as well '''

    def __init__(self, message):
        self.message = message


def checAge(age):
    if age < 18:
        try:
            raise InvalidAgeError("You are underage for voting")
        except:
            print("InvalidAgeError : ", InvalidAgeError)
    else:
        print("You are able for voting.")


checAge(int(input("Enter a age : ")))
