class FailException(Exception):  
    pass

try:
    mark = int(input("Enter the student's mark: "))
    if mark < 50 :
        raise FailException("Failed")
    else:
        print("Passed")

except FailException as e: 
    print(e)
                      
except ValueError:
    print("Please enter a valid number")


