cd src
javac RuntimeConstantPoolOOM.java
java -XX:PermSize6M -XX:MaxPermSize6m -Xmx6m RuntimeConstantPoolOOM