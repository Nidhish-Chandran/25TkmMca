import mysql.connector
mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password=""
)
cur = mydb.cursor()

cur.execute("CREATE DATABASE IF NOT EXISTS student")
print("Database created")
mydb.close()

