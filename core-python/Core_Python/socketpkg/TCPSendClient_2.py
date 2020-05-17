import socket as s

try:
    client_soc = s.socket()
    print("<---- Client to Server ---->")
    client_soc.connect(('127.0.0.1',8888))
    client_soc.send(bytes("Hello programmer"+"\nPython is fun!",'utf-8'))
    client_soc.close()
except Exception as e:
    print(e)
