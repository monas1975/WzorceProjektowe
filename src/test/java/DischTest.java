import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rozgrzewka.Disch;
import rozgrzewka.Napoli;

public class DischTest {

    private Disch disch;

    @Before
    public void setUp(){
        disch = new Napoli(29,390);
    }

    @Test
    public void shouldReturn0IfdischEqNotNull(){
        //given
        final Disch expectedObject = null;

        //when
        final Disch object = disch;

        //then
        Assert.assertEquals(expectedObject,object);

    }


}
