source_file = "source.txt"
with open(source_file, "w") as f:
    f.write("Line 1\n")
    f.write("Line 2\n")
    f.write("Line 3\n")
    f.write("Line 4\n")
    f.write("Line 5\n")

with open("source.txt", "r") as src, open("oddn_lines.txt", "w") as dest:
    line_number = 1

    for line in src:
        if line_number % 2 != 0:
            dest.write(line)
        line_number += 1

with open("oddn_lines.txt", "r") as f:
    print("Contents of odd_lines.txt:")
    print(f.read())
