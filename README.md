# jersey-rest-starter-pack
A Maven webapp/rest starter project for Jersey using Tomcat7, JOOQ and Gson

### Get started
- Modify the JDBC connection parameter for your database in `pom.xml` and `DatasourceConfig.java`
- Generate entities classes with JOOQ : `mvn jooq-codegen:generate`. The classes will be generated in `ca.obrassard.jooqentities`
- You can then use the `DSLContext` to query the DB in `WebService.java`
