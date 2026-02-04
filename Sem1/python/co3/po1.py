class Rectange:
    def __init__(self,x,y):
        self.length = x
        self.breadth = y
    def area(self):
        a = self.length*self.breadth
        return a
    def perimeter(self):
        per = 2*(self.length+self.breadth)
        return per
    

l1 = int(input("Enter the length of the 1St rectangle \n"))
b1 = int(input("Enter the breadth of the 1ST rectangle\n"))
r1=Rectange(l1,b1)


print("Perimeter of the first rectangle\n",r1.perimeter())
a1=r1.area()
print("Area of the first rectangale\n",a1)

l2 = int(input("Enter the length of the 2nd rectangle \n"))
b2 = int(input("Enter the breadth of the 1nd rectangle\n"))
r2=Rectange(l2,b2)

print("Perimeter of the Second rectangle\n",r2.perimeter())
a2=r2.area()
print("Area of the Second rectangale\n",a2)

if(a1>a2):
    print("Larger area is 1St rectangle")
else:
    print("Larger area is the 2nd rectangle")

if(a1 == a2):
    print("Area's are the same")
