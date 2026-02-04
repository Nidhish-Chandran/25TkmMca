word=input("enter words").split()
long=""
for w in word:
    if len(w)>len(long):
        long=w
print(long,"=",len(long))
