package tableperclass;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;



public class HibernateUtil {
static StandardServiceRegistry registry;
static SessionFactory sf;

public static SessionFactory getSessionFactory()
{
	try
	{
		Map<String,Object> settings=new HashMap<>();
		
		//connection properties
		settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
		settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate_inhtask1tbc");
		settings.put(Environment.USER, "root");
		settings.put(Environment.PASS, "root");
		
		//hibernate properties
		settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		settings.put(Environment.HBM2DDL_AUTO, "create");
		settings.put(Environment.SHOW_SQL, true);
		settings.put(Environment.FORMAT_SQL, true);
		
		registry=new StandardServiceRegistryBuilder().applySettings(settings).build();
		
		MetadataSources mds=new MetadataSources(registry);
		mds.addAnnotatedClass(TeamIndia.class);
		mds.addAnnotatedClass(Batsman.class);
		mds.addAnnotatedClass(Bowler.class);
		
		Metadata md=mds.getMetadataBuilder().build();
	             sf=md.getSessionFactoryBuilder().build();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return sf;
	
}
}
