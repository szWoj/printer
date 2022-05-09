import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 1000);
    }
    @Test
    public void testPrinterSuccess(){
        assertEquals("Printed successfully", printer.print(1, 80));
    }
    @Test
    public void testPrinterFail(){
        assertEquals("Cannot be Printed", printer.print(1, 101));
    }
    @Test
    public void testTonerVolumeReduced(){
        printer.print(1,80);
        printer.print(1,20);
        assertEquals(900, printer.getTonerVolume());
    }

}
