#Java EE - Aproveite toda a plataforma para construir aplicacoes - Casa do Codigo

##Wildfly connection MySQL

```
<datasource jndi-name="java:jboss/datasources/casadocodigoDS" pool-name="casadocodigoDS">
    <connection-url>jdbc:mysql://localhost:3306/casadocodigo</connection-url>
    <driver>mysql</driver>
    <pool>
        <min-pool-size>10</min-pool-size>
        <max-pool-size>20</max-pool-size>
    </pool>
    <security>
        <user-name>root</user-name>
        <password>root</password>
    </security>
</datasource>

<driver name="mysql" module="com.mysql">
    <xa-datasource-class>com.mysql.jdbc.Driver</xa-datasource-class>
</driver>
```

##modules.xml

```
<?xml version="1.0" encoding="UTF-8"?>
<module xmlns="urn:jboss:module:1.3" name="com.mysql">
    <resources>
        <resource-root path="mysql-connector-java-5.1.40-bin.jar"/>
    </resources>
    <dependencies>
        <module name="javax.api"/>
    </dependencies>
</module>
```

Fechou! :+1:
