s=input("Enter the word")
a=s[0]
b=s[1:]
new=b.replace(a,'$')
new=a+new
print(new)
