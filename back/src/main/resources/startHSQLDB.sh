# first arg is path to hsqldb/lib folder, second one is dbname
java -cp /Users/claux/Documents/FISA3/WebServices/hsqldb/lib/hsqldb.jar org.hsqldb.server.Server --database.0 file:mydb --dbname.0 "$1"