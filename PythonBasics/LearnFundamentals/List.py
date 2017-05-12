'''
Created on 11-May-2017
To learn about lists in python
@author: E002040
'''
from openpyxl.utils.cell import column_index_from_string

my_list = [1,2,3,4,5.5,'a']
print(my_list)
print('Length of string is: ',len(my_list))

for i in range(len(my_list)):
    print(my_list[i])

#To add a value to list
my_list = my_list + ['b']
print(my_list)
for i in range(len(my_list)):
    print(my_list[i])

#To add a value to list
my_list.append('c')
print(my_list)

#To remove last value
my_list.pop() 
print(my_list)

my_list.pop(1)
print(my_list)

#To reverse the value in list
new_list = ['b','e','x','a']

print(new_list.sort())


#Matrix

l_1=[2,3,1]
l_2 =['4','6','5']
l_3 =['9','0','7']

matrix = [l_1,l_2,l_3]

print(matrix)
#Slicing
print(matrix[0])

print(matrix[0][2])

print(matrix[2][2])


first_col = [row[0] for row in matrix]
print(first_col)

    