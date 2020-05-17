import socket as s

try:
    server_add = ('localhost',9000)
    client_sock = s.socket(type=s.AF_INET, family=s.SOCK_DGRAM)
    print("UDP client is waiting for a message")
    client_sock.sendto("Hello UDP server".encode('utf-8'),server_add)
    message , server_address  = client_sock.recvfrom(1024)
    print("Message Received from {} with port {}".format(server_address[0], server_address[1]))
    print("Message is : ",message.decode('utf-8'))
    client_sock.close()
except Exception as e:
    print(e)
