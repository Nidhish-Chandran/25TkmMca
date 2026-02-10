# covert to corresponding date frame

marks_dif <- as.data.frame((marks_table))
marks_dif

# median 
median(marks)

#quartiles
quantile(marks)

# standard deviation
sd(marks)

#variance
var(marks)

#summary
summary(marks)

#write marks of any 10 student and find mean, median,standard deviation,variance,and summary

nmarks <- c(45,65,56,65,80,56,60,55,68,80)

marks_fr<-as.data.frame(nmarks)
marks_fr
mean(nmarks)
median(nmarks)
sd(nmarks)
var(nmarks)
summary(nmarks)



duration <-faithful$eruptions
duration
mean(duration)

#plotting
#Barplot

barplot(
        marks,
        main="Students Marks",
        xlab="students",
        ylab = "marks",
        col = "white",
        border = "red"
        )

#pieplot

pie(
  marks,
  main = "Pie chart of students marks",
  col = rainbow(length(marks))
)


#lineplot

plot(marks,
     type = 'o',
     col='blue',
     main = "Line plot of marks",
     xlab = 'studens',
     ylab = 'marks')

#mean of grouped data
#class:40-50,50-60,60-70,70-80,80-90
# freq:4,6,10,7,5,3

#class intervals

lower<-c(40,50,60,70,80)
upper<-c(50,60,70,80,90)

#frequency

freq <-c(4,6,10,7,5,3)

#class midpoint

midpoint<-(lower+upper)/2
midpoint

#mean of grouped date

mean_gd<-sum((freq*midpoint)/sum(freq))
