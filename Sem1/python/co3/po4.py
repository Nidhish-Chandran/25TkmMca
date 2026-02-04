class Hour:
    def __init__(self, hour, minute, second=0): 
        self.__hour = hour
        self.__minute = minute
        self.__second = second
    def __add__(self, other):
       
        ss = self.__second + other.__second
        sm = self.__minute + other.__minute
        sh = self.__hour + other.__hour

        
        rem_m = ss // 60
        ss = ss % 60
        sm = sm + rem_m 

    
        rem_h = sm // 60
        sm = sm % 60
        sh = sh + rem_h 
        return Hour(sh, sm, ss)

    def display(self):
 
        print(f"H: {self.__hour} M: {self.__minute} S: {self.__second}")


h1 = int(input("Enter the hour for time 1: "))
m1 = int(input("Enter the minute for time 1: "))
s1 = int(input("Enter the second for time 1: "))


h2 = int(input("Enter the hour for time 2: "))
m2 = int(input("Enter the minute for time 2: "))
s2 = int(input("Enter the second for time 2: "))

t1 = Hour(h1, m1, s1)
t2 = Hour(h2, m2, s2)

print("\nTime 1:")
t1.display()
print("Time 2:")
t2.display()

t3 = t1 + t2
print("\nThe sum of the times is:")
t3.display()
