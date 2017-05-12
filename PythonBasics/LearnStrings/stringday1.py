'''

Created on 27-Mar-2017

@author: E002040
'''
s = 'udacity'
t = 'city'
i = 3

print s.find(t,i)

#print s.find(t)[:i]
print s[i:]
print s[5:-1]
print s[i:].find(t)
print s[i:].find(t)+i
print s[i:].find(t[i:])


page = '''<div id="top_bin"> <div id="top_content" class="width960">
   <div class="udacity float-left"> <a href="http://www.goe.com">'''
   
start_link = page.find('<a href=')
start_quote = page.find('"',start_link)
end_quote = page.find('"',start_quote+1)
print 'Link is found in:' ,end_quote
print page[start_quote+1:end_quote]
