import socket as s

try:

    server_soc = s.socket(family=s.AF_INET,type=s.SOCK_STREAM)
    server_soc.bind(('localhost',9999))
    server_soc.listen(1)
    print("<---- Server side ---->")
    while True:
        (clien_soc,(c_addr)) = server_soc.accept()
        print("Connection Established from {0} with {1} port".format(c_addr[0],c_addr[1]))
        clien_soc.send(bytes("What's your name?",'utf-8'))
        print("Welcome {} to this amazing world of python".format(clien_soc.recv(1024).decode('utf-8')))
        '''  receives are disallowed so it gives error at line 14 because at line
             15 we receive something from client '''
        #clien_soc.shutdown(s.SHUT_RD)
        ''' this disallowed both receive and send '''
        #clien_soc.shutdown(s.SHUT_RDWR)
        clien_soc.send(bytes("What's your age?", 'utf-8'))
        print("You can access the material") if int(clien_soc.recv(1024).decode('utf-8')) > 13 else print("Your age less than 13")
    clien_soc.close()
    #server_soc.close()
except Exception as e:
    print(e)
