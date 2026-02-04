num_vec<-c(4,50,6)
print(num_vec)
num_vec[2]
print(num_vec>10)
print(seq(3,100,3))
rep(3,4)
num_vec[-2]#exclude element
sort(num_vec)
rev(num_vec)
TRUE && TRUE
TRUE && FALSE
TRUE||TRUE
TRUE||FALSE
!TRUE
!FALSE


x<-c(10,22,35,75,16)
y<-c(97,10,20,33,16)
x+y
x-y
x*y
x/y
rev(x)
x==y
x!=y
x*3
rep(1000,1000)

z<-c(seq(2,100,5))
z
mean((rep(z,10)))


mylist <- list(name = 'John',age=25,score=c(30,34,34,38,29))
print(mylist)


#matrix

mat1<-matrix(1:9,nrow=3,ncol=3)
mat1
mat1[2,3]
mat1[,1]
mat1[3,]
mat2<-matrix(9:1,nrow=3,ncol=3)
mat2
mat2[2,3]
mat2[,1]
mat2[3,]
mat2%*%mat1
mat2[1:2,3:2]
4*mat1
t(mat1)
t(mat2)
det(mat1)
det(mat2)
solve(mat1)
rbind(mat1,mat2)
cbind(mat1,mat2)
mat2*mat1
sum(mat1)
sum(mat2)
mat2/mat1
apply(mat1,2,sum)
df<-dataframe(name='john', )

#1




#2


a<-2
b<-'h'
c<-a==b
class(a)
class(b)
class(c)


#3


a<-5
b<-6
c<-10
a+b
b-a
a*b
c/a



#4

num<-123
class(num)
char1<-as.character(num)
class(char1)
log1<-as.logical(num)
class(log1)
char1
log1
num


#5

str2 <- "NidhishChandran"
nchar(str2)
substr(str2,1,6)


#6
a<-2
is.numeric(a)
is.logical(a)
is.character(a)


#7

a<-6
b<-7
a=a+b
b=a-b
a=a-b
a
b



#9
cel = 30
far<-(cel*9/5)*32
far


