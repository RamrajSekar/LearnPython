'''
Created on 11-May-2017
This is to learn dictionary in python which is similar to mappings(collection of objects) or hashtable

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

#To add new key and values
d = {}
print(d)

d['animal'] = 'Dog'
d['Breed'] = 'Pomerian'

print(d)

#Nesting in Dictionary
#Format
a = {'a1':{'nestkey':{'subnestkey': 'value'}}}
print(a)
print(a['a1']['nestkey']['subnestkey'].upper())


b = {}
b['b1'] = 1
b['b2'] = 2
b['b3'] = 3
print(b)

print("The keys in b dictionary are:", b.keys())
print("The values in b dictionary are:", b.values())

print(b.items())

c = {'c1':[1,2,3]}
print(c['c1'][2])



