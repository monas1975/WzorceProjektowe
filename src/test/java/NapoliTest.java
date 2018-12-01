import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rozgrzewka.Napoli;

public class NapoliTest {

    private Napoli napoli;

    @Before
    private void setUp(){
        napoli = new Napoli(25,350);
    }

    @Test
    public void shoulReturn0IfexpectedTextEqualDescription(){
        //given
        final String expectedText = "Pizza smaczna ";

        //when
        String text = napoli.description();

        //then
        Assert.assertEquals(expectedText,text);

        //then

    }
}
