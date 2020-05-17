import socket as s

try:
    client_soc = s.socket(family=s.AF_INET,type=s.SOCK_STREAM)
    client_soc.connect(('localhost',9999))
    print(client_soc.recv(1024).decode('utf-8'))
    client_soc.send(bytes(input(),'utf-8'))
    print(client_soc.recv(1024).decode('utf-8'))
    ''' sends are disallowed it gives brokenpipe error'''
    #client_soc.shutdown(s.SHUT_WR)
    client_soc.send(bytes(input(),'utf-8'))
    client_soc.close()
except Exception as e:
    print(e)