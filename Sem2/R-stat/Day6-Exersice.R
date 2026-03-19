#Nidhish_Chandran
#MCA044


#Question 1

n=8
p=0.5

#p(x=3)
dbinom(3,size = 8,prob = 0.5)

#p(x<=3)
pbinom(3,size = 8,prob = 0.5)

#stimulate 2000
set.seed(123)
x<-rbinom(2000,size = 8,prob = 0.5)
mean(x)

#Question 2

lambda=5

#p(x=5)
dpois(5,lambda)

#p(x<=2)
ppois(2,lambda)

#simulate 3000
set.seed(123)
y<-rpois(3000,lambda)
mean(y)
var(y)


#Nidhish_Chandran
#MCA044