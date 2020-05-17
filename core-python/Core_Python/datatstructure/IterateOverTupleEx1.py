def email(people):
    result = []
    for email , name in people:
        result.append("{} <{}>".format(name,email))
    return result

print(email([("foo@example.com","foo"),("bar@example.com","bar"),("buz@example.com","buz"),("quz@example.com","quz")]))