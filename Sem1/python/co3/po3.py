'''Create a class Rectangle with private attributes length and width. Overload 
‗<‘ operator to  compare the area of 2 rectangles.'''

#class Rectangle
class Rectangle:
    def __init__(self,l,b):
        self.__length = l
        self.__breadth = b
    def area(self):
        self.area = self.__length*self.__breadth
    def __lt__(self,other):
        if self.area < other.area:
            print("The area of first rectangle is less than second\n")
        else:
            print("The area of second rectangle is less than first\n")


#First rectangle
l1 = int(input("Enter the length of the first rectangle\n"))
b1 = int(input("Enter the bredth of the first rectangle\n"))

#Second rectangle
l2 = int(input("Enter the length of the first rectangle\n"))
b2 = int(input("Enter the bredth of the first rectangle\n"))

        
R1 = Rectangle(l1,b1)
R1.area()

R2 = Rectangle(l1,b2)
R2.area()

R1 < R2
