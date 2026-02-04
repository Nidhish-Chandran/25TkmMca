'''Create a Bank account with members account number, name, type of 
account and balance. Write constructor and methods to deposit at the bank 
and withdraw an amount from the bank.''' 


class Bank:
    def __init__(self,accno,name,acctype,bala=0):
        self.name = name
        self.accno = accno
        self.acctype = acctype
        self.bala = 0
    def deposit(self):
        rs = int(input("Enter the amount you wan to insert\n"))
        self.bala = self.bala+ rs
        print("The amount is deposited sucessfully\n Balance = ",self.bala)
    def withdraw(self):
        x = int(input("\nEnter the amount you want to withdraw\n"))
        if self.bala == 0:
            print("Account empty no amount")
        else:
            print("The amount ",x,"is withdrawed\n")
            self.bala = self.bala - x
            print("The balance amount = ",self.bala)

name=(input("\nEnter your name\n"))
accno=int(input("Enter your account number\n"))
acctype=(input("Enter the account type\n"))
p1 =Bank(name,accno,acctype)
while(1):
    print("menu")
    ch=int(input("1.Deposit\n2.Withdraw\n3.exit\n"))
    if(ch==1):
        p1.deposit()
    elif ch==2:
        p1.withdraw()
    else:
        break









