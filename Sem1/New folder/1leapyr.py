y=int(input("enter the year"))
for i in range(2025,y):
    if i%100!=0:
        if 1%4==0:
            print(i)
    else:
         if(1%4==0 and i%100==0) and (i%400==0):
             print(i)
    

