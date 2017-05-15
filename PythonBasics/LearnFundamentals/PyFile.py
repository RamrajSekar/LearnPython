'''
Created on 15-May-2017
To access the txt file
@author: E002040
'''


fpath = "C:/Users/IN02040/Documents/Python/TestData/ReadText.txt"

f= open(fpath)

print(f.read())
f.seek(0) 
''' The seek is used to focus the line in the file'''
print(f.read())
f.seek(0) 
''' The readlines is used to focus every line in the file'''
print(f.readlines())

#WriteFile
