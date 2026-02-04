s = input("Enter a string: ")
s=s.lower()
a = s[0]
result = a + s[1:].replace(a, '$')
print(result)
