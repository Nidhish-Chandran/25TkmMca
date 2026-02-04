names = ['amritha', 'arjun', 'abi', 'Nidhish', 'Akhil']
count = 0
for name in names:
    count += name.lower().count('a')   
print("Total occurrences of 'a' =", count)
