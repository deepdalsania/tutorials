''' Problem Statement : We need to process a list of Event objects using their attributes
    to generate a report that lists all users currently logged in to the machines.'''

def get_event_date(event):
    return event.date

def current_users(events):
    events.sort(key=get_event_date)
    machines = {}
    for event in events:
        if event.machine not in machines:
            machines[event.machine] = set()
        if event.type == 'login':
            machines[event.machine].add(event.user)
        elif event.type == 'logout' and event.user in machines:
            machines[event.machine].remove(event.user)
    return machines

def generate_report(machines):
    for machine,users in machines.items():
        if len(users) > 0:
            users_list = ", ".join(users)
            print("{}: {}".format(machine,users_list))

class Event:
    def __init__(self,event_date,event_type,machine_name,user):
        self.date = event_date
        self.type = event_type
        self.machine = machine_name
        self.user = user

events = [
    Event('2020-05-08 12:45:56', 'login', 'iLocalMac', 'foo'),
    Event('2020-05-09 15:23:48', 'logout', 'webserver.local', 'foo'),
    Event('2020-05-08 08:42:45', 'login', 'webserver.local', 'bar'),
    Event('2020-05-09 12:45:56', 'logout', 'iLocalMac', 'foo'),
    Event('2020-05-08 11:34:22', 'login', 'webserver.local', 'foo'),
    Event('2020-05-08 10:22:34', 'login', 'mailserver.local', 'buz')

]

users = current_users(events)
print("Current Users : ",users)
generate_report(users)


