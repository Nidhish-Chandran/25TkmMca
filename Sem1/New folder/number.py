#sample prgm's


n=int(input("enter a number:\n"))
if n==0:
  print("the entered number is zero\n")
else:
  if n>0:
    print("+ve number\n")
  else:
    print("-ve number\n")

    
flowers=['Rose','Jasmine','lotus']
for f in flowers:
    print(f)
print("flowers printed\n")


for i in range(len(flowers)):
    print(flowers[i])
print("\n")

for i in range(1,10,2):
    print(i)



