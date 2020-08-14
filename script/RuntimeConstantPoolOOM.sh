cd src
javac RuntimeConstantPoolOOM.java
java -XX:PermSize=6M -XX:MaxPermSize=6m RuntimeConstantPoolOOM