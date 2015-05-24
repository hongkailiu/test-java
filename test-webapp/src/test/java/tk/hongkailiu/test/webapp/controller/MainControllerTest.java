package tk.hongkailiu.test.webapp.controller;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("classpath:mvc-dispatcher-servlet.xml")
public class MainControllerTest {
	
	@InjectMocks
	//@Mock
    private MainController mainController;
	
	@Autowired
    protected WebApplicationContext wac;
	
	private MockMvc mockMvc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		  MockitoAnnotations.initMocks(this);
	      //this.mockMvc = MockMvcBuilders.standaloneSetup(mainController).build();
		  this.mockMvc = webAppContextSetup(this.wac).build();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		String a = "a";
		assertTrue("a".equals(a));
	}
	
	@Test
	public void testDefaultPage() throws Exception {
		
		this.mockMvc.perform(get("/welcome")
	            //.param("email", "mvcemail@test.com")
	            //.param("firstName", "mvcfirst")
	            //.param("lastName", "mvclastname")
				)
	            .andExpect(status().isOk())
	            .andExpect(forwardedUrl("/WEB-INF/pages/hello.jsp"))
	            .andExpect(model().attributeExists("title"));
	}

}
