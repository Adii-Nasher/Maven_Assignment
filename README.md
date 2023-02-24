# Maven_Assignment
Create a Multi-module project according to the instructions given below:

Instructions -
Create a directory
- stringmanipulation which will have the main pom.xml
- navigate into the directory and create one module named modify-strings which will have its own pom.xml file.
  Navigate into modify-string and create two more modules named string-api and string-impl with a pom.xml
- string-api and string-impl will have their own pom.xml files. 
- In total : 4 pom.xml files
- Inside string-api : Make two methods 1. reverseString() 2. getStringLength() and give the implementation of these methods. 
- Inside string-impl : This will be the main class and call these methods here. Take the string input from the user.
Mandatory dependencies/plugins that should be in your parent pom:
- maven-checkstyle-plugin
- spotbugs-maven-plugin
- maven-surefire-plugin
- exec-maven-plugin
- Follow clean code Practice.
