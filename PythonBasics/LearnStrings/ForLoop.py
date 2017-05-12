'''
Created on 03-Apr-2017

@author: E002040
'''
from __future__ import print_function

name = raw_input("What is you name?")
print ('My name is '+name)
len(name) #To find length of string
#print name.swapcase();
result= ''.join(c.lower() if c.isupper() else c.upper() for c in name)
print (result)
#Option 1
#for letter in name:
    #print "Current Letter :" , letter
    
#Option 2: Iterating by index
print ("***Using Index****")

for index in range(len(name)):
    CurrentLetter = name[index]
    if CurrentLetter.islower():
        CurrentLetter = CurrentLetter.upper() 
    else:
        CurrentLetter = CurrentLetter.lower()
    print(CurrentLetter,"", end='')
    break;

print ("***Using Index print reverse****")

for i in range(range(len(name)-1),0):
    print(name[i:i])
    

