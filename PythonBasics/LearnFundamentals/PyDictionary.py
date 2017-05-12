'''
Created on 11-May-2017
This is to learn dictionary in python which is similar to mappings(collection of objects)

It can hold any data type
@author: E002040
'''
my_dic = {'key1':'value1','key2':'value2'}
print(my_dic['key1'])

my_dic = {'k1':'Ramraj','k2':'Sangeetha'}
print(my_dic['k1'])

my_dic1 = {'ka1':100,'ka2':200}

print("The value of ka1: ",my_dic1['ka1'])
print("The value of ka2: ",my_dic1['ka2'])

my_dic1['ka1'] += 150
my_dic1['ka2'] = my_dic1['ka2'] + 150

print("After increment ka1 value is: ", my_dic1['ka1'] ,'\n',"After increment ka2 value is: ", my_dic1['ka2'])