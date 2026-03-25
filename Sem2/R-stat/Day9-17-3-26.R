#25MCA044
#NidhishChandran

x<-c(20,22,25,26,27,23)
y<-c(31,29,32,37,35,34)
correlation<-cor(x,y)
print(correlation)
plot(x,y,main="Scatter Plot",xlab="x values",ylab="y values",pch=19)
x<-c(20,22,25,26,27,23)
y<-c(31,29,32,37,35,34)
model<-lm(y~x)
summary(model)
plot(x,y,main="Linear Regression",xlab="X",ylab="Y",pch=19)
abline(model,col="red",lwd=2)

x<-c(6,2,10,4,8)
y<-c(9,11,5,8,7)
correlation<-cor(x,y)
print(correlation)
plot(x,y,main="Scatter Plot",xlab="x values",ylab="y values",pch=19)
model<-lm(y~x)
summary(model)
plot(x,y,main="Linear Regression",xlab="X",ylab="Y",pch=19)
abline(model,col="red",lwd=2)


#25MCA044
#NidhishChandran