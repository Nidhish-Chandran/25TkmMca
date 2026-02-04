import math
result=[]
for i in range(1000,10000):
    root=int(math.sqrt(i))
    if (root*root)==i:
        if all(int(d)%2==0 for d in str(i)):
            result.append(i)
print(result)
            
               
    
