Liquibase:
------------------------------
- database change management tool (http://www.liquibase.org)


Feature:
------------------------------
- xml or sql file to store changeset
- tag database status to allow easy rollback
- maven integration
- DBDoc(javadoc style documentation)
- each change set is applied as a single transaction
- change logs are stored in "databasechangelog" table


Files:
------------------------------
- pom.xml : import DB driver, liquibse, liquibase maven plugin
- resources/db/liquibase.properties  : properties to connect & process liquibase
- resources/db/changelog/liqdemo-changelog.xml : master changelog file
- resources/db/changelog/liqdemo-v1.xml : XML style changelog
- resources/db/changelog/liqdemo-v3.sql : SQL style changelog


Demo Setup:
------------------------------
1. create database
  > createdb liqdemo
2. change database user in "resources/db/liquibase.properties"


Maven Commands:
------------------------------
- Apply Changes:
  > mvn process-resources liquibase:update

- Rollback:
  > mvn process-resources liquibase:rollback -Dliquibase.rollbackTag=version_1

- DB Doc:
  > mvn process-resources liquibase:dbDoc

- Display maven goals:
  > mvn help:describe -DgroupId=org.liquibase -DartifactId=liquibase-maven-plugin -Dversion=2.0.1 -Dfull=true


