'''
Created on 17-May-2017
This code is to send SMS using way2sms api
@author: E002040
'''

import urllib.request
#import urllib.parse
import http.cookiejar
from getpass import getpass
import sys
import os
from stat import *

message = input("Enter text: ")
number = input("Enter number: ")

if __name__ == "__main__":    
    username = "9962530086"
    passwd = "siet6060"

    message = "+".join(message.split(' '))
#http://site24.way2sms.com/content/index.html?,http://site24.way2sms.com/Login1.action?
 #logging into the sms site
    url ='http://site24.way2sms.com/content/index.html?'
    data = 'username='+username+'&password='+passwd+'&Submit=Sign+in'

 #For cookies

    cj= http.cookiejar.CookieJar()
    opener = urllib.request.build_opener(urllib.request.HTTPCookieProcessor(cj))

 #Adding header details
    opener.addheaders=[('User-Agent','Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.120')]
    try:
        usock =opener.open(url, data)
    except IOError:
        print ("error")
        #return()

    jession_id =str(cj).split('~')[1].split(' ')[0]
    send_sms_url = 'http://site24.way2sms.com/smstoss.action?'
    send_sms_data = 'ssaction=ss&Token='+jession_id+'&mobile='+number+'&message='+message+'&msgLen=136'
    opener.addheaders=[('Referer', 'http://site25.way2sms.com/sendSMS?Token='+jession_id)]
    try:
        sms_sent_page = opener.open(send_sms_url,send_sms_data)
    except IOError:
        print ("error")
        #return()

    print ("success" )
