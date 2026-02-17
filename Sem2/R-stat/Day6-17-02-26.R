n=10
p=0.5
dbinom(4,size = n,prob = p)
pbinom(4,size = n,prob = p)
1-pbinom(6,size = n,prob = p)


#In a factory, probability of producing a defective item is 0.2. if 8 items are inspected find:
n=8
p=0.2
#1.probability that exactly 2 are defective
dbinom(2,size = n, prob = p)
#2.probability that fewer than 3 are defective
pbinom(3,size = n,prob = p)
#3.probability that more than 5 are defective
pbinom(5,size = n,prob = p)


n<-20
p<-0.1

dbinom(0,size = n,prob = p)
pbinom(3,size = n,prob = p)
pbinom(10,size = n,prob = p)-pbinom(4,20,0.1)

#Binomial mean and variance 
n = 12
p = 0.3

mean_s = n * p
mean_s

var_s = n * p * (1 - p)
var_s

# simulation
set.seed(100)
sampledata = rbinom(500, n, p)
sampledata
mean(sampledata)
var(sampledata)

lambda=3
dpois(2,lambda)

ppois(2,lambda)

1-ppois(4,lambda)

lambda=5
dpois(7,lambda)
ppois(6,lambda)
ppois(6,lambda)-ppois(1,lambda)




