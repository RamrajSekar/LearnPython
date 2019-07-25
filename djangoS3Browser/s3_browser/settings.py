AWS_ACCESS_KEY_ID = ""
AWS_SECRET_ACCESS_KEY = ""
AWS_STORAGE_BUCKET_NAME = ""
AWS_S3_ENDPOINT_URL = ""
AWS_AUTO_CREATE_BUCKET = True
AWS_QUERYSTRING_AUTH = False
S3_BROWSER_SETTINGS = "djangoS3Browser"

AWS_EXPIRY = 60 * 60 * 24 * 7
control = 'max-age=%d, s-maxage=%d, must-revalidate' % (AWS_EXPIRY, AWS_EXPIRY)
AWS_HEADERS = {'Cache-Control': bytes(control, encoding='latin-1')}

TEMPLATES = [
	{ 
	'BACKEND': 'django.template.backends.django.DjangoTemplates',
    'DIRS': [],
    'APP_DIRS': True,
	'OPTIONS': 
	{
	'libraries': {'s3-load': 'djangoS3Browser.templatetags.s3-tags',},
	'context_processors': ["django.contrib.auth.context_processors.auth",'django.contrib.messages.context_processors.messages',]
	}
	}
]
SECRET_KEY = 'y130-j9oz4r5aoamn_n=+s-*7n)*3^s$jmf4(qw6ik28()g^(n'
DEBUG = True
ALLOWED_HOSTS = ['*']
ROOT_URLCONF= 'djangoS3Browser.s3_browser.urls'
LANGUAGE_CODE = 'en-us'
TIME_ZONE = 'UTC'
STATIC_URL = '{}/static/'.format(AWS_S3_ENDPOINT_URL)
STATIC_ROOT = '/static/'
INSTALLED_APPS = [
    'django.contrib.admin',
    'django.contrib.auth',
    'django.contrib.contenttypes',
    'django.contrib.sessions',
    'django.contrib.messages',
    'django.contrib.staticfiles',
    'djangoS3Browser',
]
WSGI_APPLICATION = 'djangoS3Browser.s3_browser.wsgi.application'
MIDDLEWARE = (
'django.contrib.sessions.middleware.SessionMiddleware',
'django.middleware.common.CommonMiddleware',
'django.middleware.csrf.CsrfViewMiddleware',
'django.contrib.auth.middleware.AuthenticationMiddleware',
'django.contrib.messages.middleware.MessageMiddleware',
'django.middleware.clickjacking.XFrameOptionsMiddleware',
)