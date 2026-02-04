x=int(input("Enter the side of square: "))
square_area = lambda s:s*s
print("Area of square(in cm^2): ",square_area(x))

y=int(input("Enter the length of rectangle: "))
z=int(input("Enter the breadth of rectangle: "))
rectangle_area = lambda a,b:a*b
print("Area of rectangle(in cm^2): ",rectangle_area(y,z))

b=int(input("Enter the base of triangle: "))
h=int(input("Enter the height of triangle: "))
triangle_area = lambda p,q:(p*q)/2
print("Area of triangle(in cm^2): ",triangle_area(b,h))
    
