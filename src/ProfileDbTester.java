import junit.framework.*;

public class ProfileDbTester extends TestCase{
    private ProfileDb prf;
	
    protected void setUp() throws Exception{
        prf = new ProfileDb();
    }
	
    protected void tearDown() throws Exception{
	
	prf.close();
		
    }

    public void testAddProfile() throws Exception{
	Profile tim = new Profile("tim");

	prf.addProfile(tim);
	
        assertEquals("tim",prf.getName("tim"));
	assertEquals("default",prf.getPantry("tim"));
	prf.close();
    }

    public void testAddProfile2() throws Exception{
	Profile jason = new Profile("jason","jpantry");

	prf.addProfile(jason);
	
        assertEquals("jason",prf.getName("jason"));
	assertEquals("jpantry",prf.getPantry("jason"));
	prf.close();
    }
	
    
    public void testGetName() throws Exception{
	
	assertEquals("tim",prf.getName("tim"));
	prf.close();
    }

    public void testGetName2() throws Exception{
	
	assertEquals("jason",prf.getName("jason"));
	prf.close();
    }
    
    public void testGetPantry() throws Exception{
	
	assertEquals("default",prf.getPantry("tim"));
	prf.close();
    }
    
    public void testGetPantry2() throws Exception{
	
	assertEquals("jpantry",prf.getPantry("jason"));
	prf.close();
    }
    
}