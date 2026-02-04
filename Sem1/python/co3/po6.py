# Demonstrate the use of Built in Exception classes


try:
    a = int(input("Enter the first number to divide"))
    b = int(input("Enter the second number to divide"))
    result = a / b
    print("Result:", result)
except ZeroDivisionError:
    print("Error: Cannot divide by zero.")
