import csv

# Create a CSV file named marks.csv
with open("marks.csv", "w", newline="") as file:
    writer = csv.writer(file)
    
    # Write header
    writer.writerow(["NAME", "PYTHON", "MATHS", "ENGLISH"])
    
    # Write some rows
    writer.writerow(["Alice", 85, 90, 88])
    writer.writerow(["Bob", 78, 80, 75])
    writer.writerow(["Carol", 92, 95, 91])

print("marks.csv file created successfully!")
