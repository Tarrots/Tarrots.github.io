	===== BUILD PROJECT =====

- mvn clear install or mvn install
- Update maven project
- Run project with apache

===== LifecyclePhaseNotFoundException =====

- mvn install
- mvn compiler:compile
- mvn org.apache.maven.plugins:maven-compiler-plugin:compile
- mvn org.apache.maven.plugins:maven-compiler-plugin:2.0.2:compile

===== LIBS =====
- apache
- maven
- jdbc msql

==== JDBC ====
https://www.tutorialspoint.com/jdbc/index.htm

Statement # PreparedStatement
- Statement: Không chuyền tham số vào trực tiếp được 
- PreparedStatement: Có thuyển truyền tham số qua ?, ?, ?