import static org.junit.Assert.*;
import org.junit.Test;

public class TestPT {

	GiaiPT giaiPT ;

	@BeforeClass
	public static void onTimeSetUp() {
	// one-time initialization code 
		System.out.println("@BeforeClass - oneTimeSetUp");	
	}
	@AfterClass
	public static void onTimeTearDown(){
	// one-time cleanup code
		System.out.println("@AfterClass - oneTimeTearDown");
	}
	@Before
	public void setUp() throws Exception {
		giaiPT = new GiaiPT();
	}
	@After
	public void tearDown() throws Exception{}
	
	@Test
	public void testPT1() {
	
		fail("Not yet implemented");
	}

}
