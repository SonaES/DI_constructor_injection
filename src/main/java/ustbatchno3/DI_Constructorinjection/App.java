package ustbatchno3.DI_Constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("applicationContext.xml"); 
    	Role r=context.getBean("Role",Role.class);
    	r.display();
    	ApplicationContext context1 =   
    		    new ClassPathXmlApplicationContext("applicationContext.xml"); 
    	Role s=context1.getBean("Role1",Role.class);
    	s.display();
    }
}
