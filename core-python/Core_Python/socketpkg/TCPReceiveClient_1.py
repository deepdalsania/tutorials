import socket as s

try:
    ''' Here we are not mentioning anything then it takes all default values '''
    client_soc = s.socket()

    # here also we have to pass arg as one object
    client_soc.connect(('localhost',7777))

    ''' in recv method we have to pass buffer size and also we have to decode from byte 
     to str '''
    print(client_soc.recv(1024).decode())
    client_soc.close()
except Exception as e:
    print(e)
