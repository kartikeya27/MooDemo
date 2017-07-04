To start the Moo Demo project, we need Selenium WebDriver 2.53, test automation for web applications

It contains a Maven project with POM.xml file. It contains all necessary dependencies related to this project.

Java

You must have Java installed. The recommended version is Java 8. Download it from Oracle 
http://www.oracle.com/technetwork/java/javase/downloads/index.html and install it.

Maven

Maven must be installed for this to work. Maven can be downloaded from http://maven.apache.org/download.cgi.

Please setup home environment for java and Maven.

Getting Started

To get right up and started, you can check out the project from GitHub. 
If you don't know how, the below link will be helpful. 
https://git-scm.com/book/en/v2/Git-Basics-Getting-a-Git-Repository

Prerequisites

Maven (if using eclipse, install Maven Integration for Eclipse)
TestNG
Java
WebDriver (Chrome, Firefox, IE, etc)

Drivers

Currently, all drivers are not packaged with this project, but they may be in the future!

Download Chromedriver.exe from the link
https://chromedriver.storage.googleapis.com/index.html?path=2.30/
In your local window system please install Chromedriver.exe on your C: drive.

Project Structure
(1) Once java and Maven are setup properly on Window machine,
(2) check the project git clone https://github.com/kebijebi/MooDemo.git
(3) cd PageObjectModel_WithPageFactory then run mvn install. Maven will install all necessary dependencies using pom.xml.
(4) Upload maven project on eclipse using mvn eclipse:eclipse. If you are using IntelliJ, then this steps would very straight forward 
    . Just give pom.xml and the rest of the things will install automatically by IntelliJ.
(5) Once all the above steps are complete, click on “clean” from the project menu.
(6) In eclipse right click on SearchTest.java and run as a TestNG Test.
(7) All four scenarios will run on browser and in console window you will see the result. 
(8) I have used extent report for this project. so, you need to define your local path . For example 
C: drive
    //Report Path
    public static final String REPORT_PATH="C:\\Reports\\";
    //Screenshot path
    public static final String SCREEN_SHOT_PATH="C:\\Screenshots\\";

  
  


