num=input("enter the numbers")
num1=[int(x) for x in num1.split()]
result=[]
for n in num1:
    if num>100:
        result.append("over")
    else:
        result.append(n)
print(result)
