#MCA044
#Nidhish Chandran

#Question-1

#Create a numeric vector
num <-c(10,12,15,18,20,22,25,30,35,40,45,100)

#mean of the num
mean(num)

#median of the num
median(num)

#first and third quartile
quantile(num,probs=c(0.25,0.75))

#summary of the num
summary(num)

#Question-2 => Calculate variance and standard deviation

x<-c(10,12,15,18,20,22,25,30,35,40,45,100)
n<-length(x)
x_mean<-mean(x)
variance<-sum(((x-x_mean)^2)/(n-1))
std_dev<-sqrt(variance)
variance
std_dev

#Question-3 => for a given data set show using R output that the mean and median are not equal
#Explain the reason brie

m<-c(10,12,15,18,20,22,25,30,35,40,45,100)
mean(m)
median(m)
#The mean and median are not equal because the data set 
#contain an extreme value The mean is affected by the outliers but 
#median is not
#Hence the mean get pulled towards the larger value



# Part B:Grouped Data

#Question 4:


lower<-c(0,10,20,30,40)
upper<-c(10,20,30,40,50)
f<-c(3,7,12,8,5)

mid<-(lower+upper)/2
mid

#mean of grouped data

mean_grouped<-sum(f*mid)/sum(f)
mean_grouped

#Question 4B:

cbind(lower,upper,mid)

#Question 5:Cumulative frequency

cf <-cumsum(f)
cf

#Total frequency
N<-sum(f)
N
N/2

#Find the median class (20-30)

#Median

L<-20
cf_prev<-10
f_m<-12
h<-10
N<-sum(f)

median_grouped<-L+((N/2-cf_prev)/f_m)*h
median_grouped

#Part C: Data Visualization

#Question 6

classes<-c("0-10","10-20","20-30","30-40","40-50")
freq<-c(3,7,12,8,5)

barplot(freq,
         names.arg=classes,
         main="Number of Students in each classes interval",
         xlab="Class interval",
         ylab="Number of students",
         col="Skyblue")

#Question 7

sales<-c(120,90,60,150,80)
labels<-c("A","B","C","D","E")

pie(sales,labels = labels,main="Sales of five Products")

#B:

percent<-round(sales/sum(sales)*100,1)
pie(
    sales,
    labels = paste(labels,percent,'%'),
    main="Sales of five Products"
    )

#Question 8

months <- c("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec")
rain <- c(52, 40, 35, 60, 110, 220, 180, 160, 140, 90, 70, 55)
plot(1:12, rain,
     type = "o",
     xaxt = "n",
     xlab = "Month",
     ylab = "Rainfall (mm)",
     main = "Monthly Rainfall")

axis(1, at = 1:12, labels = months)

#B
months[which.max(rain)]


#MCA044
#Nidhish Chandran