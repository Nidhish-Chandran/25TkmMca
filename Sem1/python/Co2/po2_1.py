from graphics import *

# Rectangle
l = int(input("Enter the length of the rectangle: "))
b = int(input("Enter the breadth of the rectangle: "))
print("Rectangle area:", area(l, b))
print("Rectangle perimeter:", perimeter(l, b))

# Circle
r = int(input("Enter the radius of the circle: "))
print("Circle area:", area(r))
print("Circle perimeter:", perimeter(r))

# Cuboid
l1 = int(input("Enter the length of the cuboid: "))
b1 = int(input("Enter the breadth of the cuboid: "))
h1 = int(input("Enter the height of the cuboid: "))
print("Cuboid area:", area(l1, b1, h1))
print("Cuboid perimeter:", perimeter(l1, b1, h1))

# Sphere
r = int(input("Enter the radius of the sphere: "))
print("Sphere area:", area(r))
print("Sphere perimeter:", perimeter(r))
