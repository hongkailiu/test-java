package tk.hongkailiu.test.app.es;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hongkailiu on 2015-07-18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:es-applicationContext.xml")
public class EmployDAOTestIT {

    static Logger logger = Logger.getLogger(EmployDAOTestIT.class);

    @Autowired
    @Qualifier("EmployeeDAOImpl")
    private EmployDAO unitUnderTest;

    private Employee employee = new Employee();

    @Before public void setup(){
        Assert.assertNotNull(unitUnderTest);
        employee.setFirstname("John");
        employee.setLastname("Smith");
        employee.setAge(25);
        employee.setAbout("I love to go rock climbing");
        employee.setInterests(new String[]{"sports", "music"});
    }

    @Test public void testPut() throws Exception {
        logger.debug("testPut");
        employee.setFirstname("John" + System.currentTimeMillis());
        String result = unitUnderTest.put(employee);
        logger.debug("result: " + result);
    }
}
