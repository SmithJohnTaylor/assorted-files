import java.sql.*; 
import groovy.sql.Sql 
@GrabConfig(systemClassLoader=true)
@Grab(group='org.postgresql', module='postgresql', version='9.4-1205-jdbc42')
import java.sql.*; 
import groovy.sql.Sql 
def test = "test"
def sql = Sql.newInstance('jdbc:postgresql://med:5432/alfresco', 
 'postgres', 'Alfresco01', 'org.postgresql.Driver')
	
sql.eachRow('select * from medtronic where customerlastname=\'Smith\'') {
 tp ->
 test=[tp.bloodpressuresystolic];
 println(test.join(','));
} 
sql.close()  

