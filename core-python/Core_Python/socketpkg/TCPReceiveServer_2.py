import socket as s

try:
    server_soc = s.socket(family=s.AF_INET,type=s.SOCK_STREAM)
    server_soc.bind(('127.0.0.1',8888))
    server_soc.listen(1)
    client_soc , c_addr = server_soc.accept()
    print("Connection Established from {0} with {1} port".format(c_addr[0],c_addr[1]))
    print("<---- Server side ---->")
    for i in client_soc.recv(1024).decode('utf-8').split("\n"):
        print(i)
    client_soc.close()
    server_soc.close()
except Exception as e:
    print(e)