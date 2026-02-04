filename = "data1.txt"

lines_list = []

with open(filename, "r") as file:
    for line in file:
        lines_list.append(line.strip())
      
print("Lines stored in list:", lines_list)
