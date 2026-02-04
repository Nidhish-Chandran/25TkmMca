list1=(input("enter the first list of numbers")).split(',')
list2=(input("enter the second list of numbers")).split(',')
if len(list1)==len(list2):
    print("length same")
else:
    print("length not same")
l1=int(list1)
l2=int(list2)
if sum(l1)==sum(l2):
    print("sum same")
else:
    print("sum not same")
cv=set(list1)&set(list2)
if cv:
    print("common value",cv)
else:
    print("no common value")
    
