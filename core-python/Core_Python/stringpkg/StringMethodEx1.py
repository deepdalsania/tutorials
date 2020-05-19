''' If your company needs to change their old email domain with new domain '''


def replace_domain(email, old_domain, new_domain):
    if old_domain in email:
        return email[:email.index(old_domain)] + new_domain

''' you can pass file of containing email and use for loop'''
print("Before Replacing domain email is 'python@yahoo.com' ")
print("After Replacing domain email is : ",replace_domain('python@yahoo.com','yahoo.com','gmail.com'))