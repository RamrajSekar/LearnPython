'''
Created on 10-Apr-2017

@author: E002040
'''

print("Test it's not to test \n Test the test")

print("Test \t tester")

a ='Ramraj'
b = 'Sangeetha'
print(len(a))

for i in range(len(a)):
    print("The value at index",i, "is:", a[i])

print(a[::1])

print(a[::2])

#Reverse a string
print(a[::-1])

print(a.upper(), '\n',a.lower(), '\n', a.split('a'))

#Print formating
print('My husband name is: %s \n My wife name is: %s' %(a,b))
print('First: {x} \n Second: {y}'.format(x=a,y=b))

#No the expected format: print('Test it's not to test')
s = 'CidatyUcityda'
print (s[-7]+s[2:4]+s[7:11])

#print marker[-1]+marker[-2]+marker[-3]
    
        