# first arg is path to hsqldb/lib folder, second one is dbname
java -cp "$1"/hsqldb.jar org.hsqldb.server.Server --database.0 file:mydb --dbname.0 "$2"