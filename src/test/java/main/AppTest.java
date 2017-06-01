package main;

import java.util.ArrayList;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{   
    private ArrayList<Dice> wins = new ArrayList<Dice>(3);
    private Dice dice1 = new Dice(4);
    private Dice dice2 = new Dice(2);
    private Dice dice3 = new Dice(1);
    Dice mockDice5 = mock(Dice.class);
    Dice mockDice4 = mock(Dice.class);
    Dice mockDice2 = mock(Dice.class);
    Dice mockDice1 = mock(Dice.class);
    
    private Throw t = new Throw();
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testIsWonThrow(){
        wins.add(new Dice(2));
        wins.add(new Dice(4));
        wins.add(new Dice(1));
        assertEquals(true, t.checkDice(wins));
        wins.clear();
        wins.add(new Dice(1));
        wins.add(new Dice(2));
        wins.add(new Dice(4));
        assertEquals(true, t.checkDice(wins));
        wins.clear();
        wins.add(new Dice(4));
        wins.add(new Dice(2));
        wins.add(new Dice(1));
        assertEquals(true, t.checkDice(wins));
        wins.clear();
        wins.add(new Dice(5));
        wins.add(new Dice(5));
        wins.add(new Dice(5));
        assertEquals(true, t.checkDice(wins));
    }
        
    public void testDiceNb(){
        assertEquals(4, dice1.getDiceNb());
        assertEquals(2, dice2.getDiceNb());
        assertEquals(1, dice3.getDiceNb());
    }

    public void testDiceThrow(){
        Dice d = new Dice();
        int diceNb = d.getDiceNb();
        assertEquals(true, (diceNb<=6 && diceNb>=1));
    }
    
    public void testMockitoDice421(){
        when(mockDice4.getDiceNb()).thenReturn(4);
        when(mockDice2.getDiceNb()).thenReturn(2);
        when(mockDice1.getDiceNb()).thenReturn(1);
        wins.clear();
        wins.add(mockDice4);
        wins.add(mockDice2);
        wins.add(mockDice1);
        assertEquals(true, t.checkDice(wins));
    }
    
        public void testMockitoDice555(){
        when(mockDice5.getDiceNb()).thenReturn(5);
        wins.clear();
        wins.add(mockDice5);
        wins.add(mockDice5);
        wins.add(mockDice5);
        assertEquals(true, t.checkDice(wins));
    }
    
}
