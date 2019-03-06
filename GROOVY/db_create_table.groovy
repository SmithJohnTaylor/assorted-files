import java.sql.*;
import groovy.sql.Sql
@GrabConfig(systemClassLoader=true)
@Grab(group='org.postgresql', module='postgresql', version='9.4-1205-jdbc42')
import java.sql.*;
import groovy.sql.Sql

def sql = Sql.newInstance('jdbc:postgresql://gov:5432/alfresco',
 'postgres', 'Alfresco01', 'org.postgresql.Driver')

sql.execute(''''''
      CREATE TABLE demoSites (
        incident_id SERIAL PRIMARY KEY,
        siteName VARCHAR(255)
     )
 '''
sql.close()
