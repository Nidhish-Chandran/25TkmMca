#creating a table 
# marks obtained by a group of students
marks <- c(45,45,56,65,80,72,60,55,68,75)
marks_table <- table(marks)
marks_table

#Bar plot

barplot(marks , 
        main = "Marks of student(bar chart)",
        xlab="students",
        ylab="Marks",
        col = "skyblue",
        border = "black"
        )
