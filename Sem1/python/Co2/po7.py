import csv

student = [
    { "Name" : "John" , "Branch" : "CSE" , "Year" : 2016 },
    { "Name" : "Jack" , "Branch" : "CSE" , "Year" : 2010 },
    { "Name" : "James" , "Branch" : "EEE" , "Year" : 2019 }
]


fn = "data1.csv"


#fields = ["Name", "Branch", "Year"]

'''with open(fn, 'w', newline=  "") as new:
    writer = csv.DictWriter(new, fieldnames=fields)
    writer.writeheader() 
    writer.writerows(student)  '''

print("CSV file created successfully\n")

print("Reading the CSV file just written\n")
 
with open(fn, 'r') as new:
    reader = csv.DictReader(new)
    for row in reader:
        print(row)
