cd src
javac HeapOOM.java
java -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError HeapOOM