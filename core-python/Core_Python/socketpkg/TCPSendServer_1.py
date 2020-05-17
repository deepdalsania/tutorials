import socket as s

try:
    ''' AF = Address Family [AF_INET = IPV4(default) , AF_INET = IPV6 ]
        PF = Protocol Family
        SOCK_STREAM = [connection oriented - TCP](default)
        SOCK_DGRAM = [connection less - UDP]
        proto = 0 [ The protocol number is usually zero and may be omitted or in the
                    case where the address family is AF_CAN the protocol should be 
                    one of CAN_RAW, CAN_BCM or CAN_ISOTP.]
        fileno = None [ If fileno is specified, the values for family, type, and 
                        proto are auto-detected from the specified file descriptor. 
                        Auto-detection can be overruled by calling the function with
                        explicit family, type, or proto arguments.]
        Reference : https://docs.python.org/3/library/socket.html
        '''
    server_soc = s.socket(family=s.AF_INET,type=s.SOCK_STREAM,proto=0,fileno=None)

    # bind socket with port
    ''' if we are passing like this server_soc.bind('localhost',7777) it gives 
        TypeError that it takes only one arg so we have to pass one arg as object '''
    server_soc.bind(('localhost',7777))

    ''' at one point how many client will connect and here is 1 so after one connection
        all connection would be refeused '''
    server_soc.listen(1)

    # accept return tuple which contains (socket , address)
    client_soc , c_addr = server_soc.accept()
    ''' c_addr have two values as tuple (address , port) '''
    print("<---- Server to Client ---->"+"\nConnection Established from {0} with {1} port".format(c_addr[0],c_addr[1]))

    # send require byte fromat so we can't pass string directly
    client_soc.send(bytes("Welcome to Python Network Programming Tutorial","utf-8"))
    client_soc.close()
    server_soc.close()
except Exception as e:
    print(e)


