from graphics import *
from graphics.Dgraphics import cuboid
from graphics.Dgraphics import sphere1 as s


#rectangle

l=int(input("Enter the length of the rectange"))
b=int(input("Enter the bredth of the rectangle:"))
graphics.rectangle.area(l,b)
graphics.rectangle.perimeter(l,b)


#circle

r=int(input("Enter the radius of the circle"))
cricle.area(r)
cricle.perimeter(r)

#cuboid

l1=int(input("Enter the length of the Cuboid"))
b1=int(input("Enter the length of the Cuboid"))
h1=int(input("Enter the length of the Cuboid"))
cuboid.area(l1,b1,h1)
cuboid.perimeter(l1,b1,h1)



#sphere
r=int(input("Enter the radius of the sphere"))
print(s.area(r))
print(s.perimeter(r))





