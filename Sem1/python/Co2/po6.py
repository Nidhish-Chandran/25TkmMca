import csv

with open("data.csv", "w", newline="") as file:
    writer = csv.writer(file)
    writer.writerow(["Name", "Age", "City"])
    writer.writerow(["Alice", "25", "New York"])
    writer.writerow(["Bob", "30", "London"])
    writer.writerow(["Charlie", "28", "Sydney"])

columns_to_read = ["Name", "City"]

with open("data.csv", "r") as file:
    reader = csv.DictReader(file)  
    for row in reader:
        selected_data = [row[col] for col in columns_to_read]
        print(selected_data)
