list1 = [int(x) for x in input("Enter the first list of numbers: ").split(',')]
list2 = [int(x) for x in input("Enter the second list of numbers: ").split(',')]
if len(list1) == len(list2):
    print("Length same")
else:
    print("Length not same")
if sum(list1) == sum(list2):
    print("Sum same")
else:
    print("Sum not same")
cv = set(list1) & set(list2)
if cv:
    print("Common values:", cv)
else:
    print("No common values")
