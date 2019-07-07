package org.data.sql;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class JMXTest {
 
    public static void main(String[] args) throws Exception { 
        MBeanServer mbs =
            ManagementFactory.getPlatformMBeanServer();
                
        ObjectName mxbeanName = new ObjectName("com.data.sql:type=A");
        A mxbean = new A();
        mxbean.set(11);
        mbs.registerMBean(mxbean, mxbeanName);
                 
        System.out.println("Waiting..."); 
        while (true){
            System.out.println(mxbean.get());
            Thread.sleep(1000);
        }
    } 
} 
 