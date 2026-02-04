from graphics import rectangle as r
from graphics import circle as c
from graphics.Dgraphics import cuboid
from graphics.Dgraphics import sphere1 as s


#rectangle

l=int(input("Enter the length of the rectange"))
b=int(input("Enter the bredth of the rectangle:"))
r.area(l,b)
r.perimeter(l,b)


#circle

r=int(input("Enter the radius of the circle"))
c.area(r)
c.perimeter(r)

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





