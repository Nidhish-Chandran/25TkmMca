class Rectangle:
    def __init__(self, length, width):
        self.__length = length
        self.__width = width

    def area(self):
        return self.__length * self.__width

    def __lt__(self, other):
        return self.area() < other.area()


# Input for first rectangle
l1 = int(input("Enter the length of the first rectangle: "))
b1 = int(input("Enter the breadth of the first rectangle: "))

# Input for second rectangle
l2 = int(input("Enter the length of the second rectangle: "))
b2 = int(input("Enter the breadth of the second rectangle: "))

R1 = Rectangle(l1, b1)
R2 = Rectangle(l2, b2)


if R1 < R2:
    print("First rectangle is smaller in area than the second rectangle.")
elif R2 < R1:
    print("Second rectangle is smaller in area than the first rectangle.")
else:
    print("Both rectangles have the same area.")
