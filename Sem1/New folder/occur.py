text=input("enter the text")
words=text.split()
wordcout={}
for word in words:
    if word in wordcount :
        wordcout[word]+=1
    else:
        wordcount[word]=1
print(wordcount)
    
