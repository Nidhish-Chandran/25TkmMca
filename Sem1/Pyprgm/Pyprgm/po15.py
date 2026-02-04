s1 = input("Enter first string: ")
s2 = input("Enter second string: ")
if len(s1) > 1 and len(s2) > 1:
    new_s1 = s2[-1] + s2[1] + s1[2:]
    new_s2 = s1[0] + s1[1] + s2[2:-1]+s[0]
    result = new_s1 + " " + new_s2
    print("Result:", result)
else:
    print("Both strings must have at least 2 characters")
