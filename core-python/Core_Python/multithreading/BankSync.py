from threading import Thread, Condition, RLock
from time import sleep

''' This example is about withdraw money and deposit money with threading and synchronization '''


class Balance:
    t_amount = 50000
    def withdraw(self, w_amount):
        cv = Condition()
        with cv:
            if self.t_amount < w_amount:
                cv.wait()
                if self.t_amount > w_amount:
                    self.t_amount -= w_amount
                    print("After withdraw, Available balance is {} ".format(self.t_amount))
            else:
                print("You have suffiecient money for withdraw")
                self.t_amount -= w_amount
                print("After withdraw, Available balance is {} ".format(self.t_amount))

    def deposit(self, d_amount):
        cv = Condition()
        with cv:
            self.t_amount += d_amount
            print("After deposit, Available balance is {} ".format(self.t_amount))
            cv.notify()


class FirstUser(Thread):

    def __init__(self, w_amount, lock):
        Thread.__init__(self)
        self.w_amount = w_amount
        self.lock = lock
        #self.cv = cv

    def run(self):
        with self.lock:
            b = Balance()
            b.withdraw(self.w_amount)


class SecondUser(Thread):

    def __init__(self, d_amount, lock):
        Thread.__init__(self)
        self.d_amount = d_amount
        self.lock = lock
        # self.cv = cv

    def run(self):
        with self.lock:
            b = Balance()
            b.deposit(self.d_amount)


if __name__ == "__main__":
    w_amount = int(input("Enter the amount to withdraw : "))
    print("Withdrawal amount is : ", w_amount)
    lock = RLock()
    fu = FirstUser(w_amount, lock)
    fu.start()
    d_amount = int(input("Enter the amount to deposit : "))
    print("Deposit amount is : ", d_amount)
    su = SecondUser(d_amount, lock)
    sleep(1)
    su.start()
