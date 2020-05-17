class my_exceptions(Exception):
   """Base class for other exceptions"""
   pass

class pdv_error_response(my_exceptions):
    def __init__(self, tag, message):
        self.tag = tag
        self.tag = message

def tryerror(x):
    if x < 0:
        raise(pdv_error_response('test','output'))

def main():
    try:
        tryerror(-1)
    except pdv_error_response as e:
        if pdv_error_response:
            print(e)

if __name__ == '__main__':
    main()