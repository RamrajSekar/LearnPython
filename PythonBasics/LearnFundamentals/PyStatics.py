'''
Created on 10-Apr-2017

@author: E002040
'''
#Mean = average of given numbers

#Median: First the given numbers should be in numerical order and the median is the middle number. 
#Median: 1,2,4,7 In this example, the numbers are already listed in numerical order, so I don't have to rewrite the list. But there is no "middle" number, because there are an even number of numbers. 
#Because of this, the median of the list will be the mean (that is, the usual average) of the middle two values within the list. 
#The middle two numbers are 2 and 4,So (2+4)/2 = 3 is the median value

#Mode is the number repeated twice

#Range: From the given number find the largest and deduct from smallest 

a = [1,2,3,4,5,5]
b = 0

for i in a:
    b = b+i

print ('The sum of values in a is: ',b)
print ('The mean of a is: ',b/len(a))

print (a[::-1])


