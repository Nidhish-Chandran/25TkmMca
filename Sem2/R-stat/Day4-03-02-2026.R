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
marks <- c(45,65,56,65,80,56,60,55,68,80)