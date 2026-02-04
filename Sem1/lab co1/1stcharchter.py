s=input("enter a string")
a=s[0]
d=s.replace(s[0],'$')
s=d.replace(d[0],a,1)
print(s)
