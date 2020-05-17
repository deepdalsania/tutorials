import socket as s

try:
    server_soc = s.socket(type = s.AF_INET , family=s.SOCK_DGRAM)
    server_soc.bind(('localhost',9000))
    ''' can't use listen here '''
    #server_soc.listen(1)
    print("UDP server is listening")
    while True:
        (message ,client_address) = server_soc.recvfrom(1024)
        print("Message Received from {} with port {}".format(client_address[0],client_address[1]))
        print("Message is : ",message.decode('utf-8'))
        server_soc.sendto("Welcome to Python Network Programming Tutorial With UDP".encode('utf-8'),client_address)
    server_soc.close()
except Exception as e:
    print(e)
