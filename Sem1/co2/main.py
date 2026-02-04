from graphics import *

# Rectangle
l = int(input("Enter the length of the rectangle: "))
b = int(input("Enter the breadth of the rectangle: "))
print("Rectangle area:", rect_area(l, b))
print("Rectangle perimeter:", rect_perimeter(l, b))

# Circle
r = int(input("Enter the radius of the circle: "))
print("Circle area:", circle_area(r))
print("Circle perimeter:", circle_perimeter(r))

# Cuboid
l1 = int(input("Enter the length of the cuboid: "))
b1 = int(input("Enter the breadth of the cuboid: "))
h1 = int(input("Enter the height of the cuboid: "))
print("Cuboid area:", cuboid_area(l1, b1, h1))
print("Cuboid perimeter:", cuboid_perimeter(l1, b1, h1))

# Sphere
r = int(input("Enter the radius of the sphere: "))
print("Sphere area:", sphere_area(r))
print("Sphere perimeter:", sphere_perimeter(r))
