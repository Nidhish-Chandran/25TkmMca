text=input("enter the text")
words=text
wordcount={}
for word in words:
    if word in wordcount :
        wordcount[word]+=1
    else:
        wordcount[word]=1
print(wordcount)
