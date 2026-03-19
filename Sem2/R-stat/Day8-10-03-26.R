#MCA044
#Nidhish Chandran

1-pnorm(2.67,mean = 0,sd=1)

qnorm(0.95,0,1)

lambda = 1/20
pexp(30,rate=1/20,lower.tail=FALSE)
pexp(24,rate=1/20)-pexp(16,rate=1/20)

#DENSITY FUNCTION

dexp(16,rate = 1/20)

#p(X<x) =0.8,x=?
qexp(0.8,rate = 0.5)

#questions answers

#1

#p(x>8)
lambda<-1/10
pexp(8,rate=lambda,lower.tail=FALSE)

#p(5<x<12)
pexp(12,rate=lambda)-pexp(5,rate=lambda)

#2

lambda<-0.2

#p(x<=6)
pexp(6,rate=lambda)

#p(x>10)
pexp(10,rate=lambda,lower.tail=FALSE)

#3
lambda=1/20
pexp(30,rate=lambda)-pexp(5,rate=lambda)
pexp(24,rate=lambda)-pexp(16,rate=lambda)

#4
lambda=0.1
pexp(15,rate = lambda)
pexp(20,rate=lambda,lower.tail=FALSE)

#5
lambda=5
pexp(3,rate=lambda)
pexp(7,rate=lambda,lower.tail=FALSE)

#6
lambda=1/100
pexp(80,rate=lambda)
pexp(120,rate=lambda)-pexp(60,rate=lambda)