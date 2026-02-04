class Student:
    #INFORMATION ABOUT THE CLASS
    student_count=0
    #__init__function caat like a construtor and intialize the values of the object created 
    def __init__(self,roll,name,course):
        self.rollno=roll
        self.name=name
        self.course=course
        Student.student_count=Student.student_count+1

    #display student count fn
    def display_count():
        print("the total number of student is:",Student.student_count)

    #display student details
    def display(self):
        print("Roll no:",self.rollno)
        print("Student name:",self.name)
        print("Course:",self.course)


    # automatically destory the class defualtly after the prgm end
    def __del__(self):
        class_name=self.__class__.__name__
        print(class_name,"Destroyed")

s1=Student(501,'Nidhish','MCA') #creating object for the class Student also intialize the values for the object using __init__ fn/method
s2=Student(502,'Nikesh','Msc Chemistry')
s1.display()
s2.display()
print(getattr(s1,'name'))
print(hasattr(s1,'name'))
setattr(s1,'course','MBA')
s1.display()
delattr(s2,'course')

Student.display_count()

'''print(Student.__dict__)
print(Student.__doc__)
print(Student.__name__)
print(Student.__module__)
print(Student.__bases__)
'''

