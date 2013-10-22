ReadyToCook
===========

Groovy/Java ready-to-cook solutions package for testing Web-Services (SOAP/REST) and/or Web-UI.

Ready-to-Cook means that you can start writing tests in 2 minutes after download.
There are some examples for UI and WS testing, that will make your start easier.

Components:
Ivy as dependencies manager
Ant as builder
log4j as logger
TestNG as testing framework
wslite as web-services client
selenium webdriver as web ui testing tool

Required software:
JDK
Ant
Ivy

Desired software:
IDE (I use Eclipse, cause of it's free, and have testng, ant and ivy plugins)

Start working:
git clone
ant resolve
write tests here
ant runtests

Integration with CI server (example Jenkins):
in the BUILD part select "invoke ant" and specify "target = runtests"
