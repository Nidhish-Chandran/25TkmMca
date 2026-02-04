import mysql.connector
mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="student"
)
cur = mydb.cursor()


'''cur.execute("""
CREATE TABLE IF NOT EXISTS marks (
    ROLLNO INT,             
    NAME CHAR(20),
    TOTAL INT
)
""")
print("Table created")



cur.execute("INSERT INTO marks VALUES (200, 'Nidhish', 100)")
cur.execute("INSERT INTO marks VALUES (201, 'Nehmal', 90)")
cur.execute("INSERT INTO marks VALUES (202, 'Neeraj', 80)")
mydb.commit()
print("Records inserted")'''



cur.execute("SELECT * FROM marks WHERE TOTAL > 90")
res = cur.fetchall()

print("\nStudents with marks > 90:")
for r in res:
    print(r)



cur.execute("UPDATE marks SET TOTAL = 100 WHERE ROLLNO = 200")
mydb.commit()
print("\nMarks updated for Roll No 200")



cur.execute("SELECT * FROM marks")
rows = cur.fetchall()

print("\nUpdated Marks Table:")
for r in rows:
    print(r)

mydb.close()
