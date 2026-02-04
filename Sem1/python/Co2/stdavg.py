import csv
import os


file_path = os.path.join(os.path.dirname(__file__), "marks.csv")


with open(file_path, "r", newline="") as file:
    reader = csv.DictReader(file)
    
    total = 0
    count = 0


    for row in reader:
        try:
            total += int(row["PYTHON"]) 
            count += 1
        except (ValueError, KeyError):
            print(f"Skipping invalid row: {row}")



average = total / count if count > 0 else 0
print("Average PYTHON Marks:", average)
