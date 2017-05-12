'''
Created on 04-May-2017

@author: E002040
'''
import openpyxl

xlpath = "C:/Users/IN02040/Documents/Python/TestData/Smsproj.xlsx"
wb = openpyxl.load_workbook(xlpath)

#To print sheet names
print(wb.get_sheet_names())

#To print specific sheet name
sheet = wb.get_sheet_by_name('First')
print(sheet)

#To get specific cell value
a1_cellvalue = sheet['A1'].value
print(a1_cellvalue) 

row_count = sheet.max_colum
print(row_count)

