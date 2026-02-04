import re

text = "Python is fun and powerfull"
words = re.findall(r'b[fp]\w*',text)
print(words)
