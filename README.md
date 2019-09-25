# Load Transactions Application

### Requirements
This application is developed for reading payment transactions from GPC formatted input files. (For parsing GPC format CSOB and FIO bank GPC formats have been used). Loading them into objects and then writing them to program output and MongoDB.
The input file is read from /input folder and if the file has extension ¨GPC¨ then GPC parser is called.


### Installation
1. You need Java version 1.8 at least. 

2. For running this application you need to have MongoDB installed to your localhost. For installing MongoDB below instructions can be followed for windows.

https://docs.mongodb.com/manual/tutorial/install-mongodb-on-windows/ 
After installation MongoDB runs as a windows service. Data file folders and log folders are automatically configured.

By default MongoDB driver connects to MongoDB server at mongodb://localhost/test. If DB test does not exist it’s been created by driver. And object is inserted as collection having the same name as object.

3. Run the application jar file directly.

- Copy the application jar file loadtransactions\target\loadtransactions-0.0.1-SNAPSHOT.jar to a folder.
- Under same folder create /input folder and copy the transactions file to here.
- Run the jar file

>java -jar "loadtransactions-0.0.1-SNAPSHOT.jar"

If you want to download and run the project from an IDE:

1.Clone this project by typing in the git bash the following command:
git clone https://github.com/ugayretli/loadtransactions.git

3. Import the Maven project into Eclipse.

4. Run the application as Java Application


### Output
The transactions being read are outputed to program output and also to MongoDB. 



