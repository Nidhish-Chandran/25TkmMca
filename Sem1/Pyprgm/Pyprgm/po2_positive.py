n=int(input ("enter the total number of elements in the list"))
print("enter the integers")
l=[]
for i in range (n):
    x=int(input())
    l.append(x)
print(l)
n=[i for i in l if i>0]
print(n)
