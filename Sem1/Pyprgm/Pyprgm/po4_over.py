num = input("Enter the numbers separated by space: ")
num1 = [int(x) for x in num.split()]
result = []

for n in num1:
    if n > 100:
        result.append("over")
    else:
        result.append(n)

print(result)
