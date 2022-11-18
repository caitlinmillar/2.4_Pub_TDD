import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import server.Guest;
import server.Server;

import java.util.Currency;
import java.util.Locale;
import static org.assertj.core.api.Assertions.assertThat;


//start here

public class ServerTest {
    Guest guest = new Guest("Ann", 19, 66, 10);
    Server server;


    @BeforeEach
    public void setUp() {
        server = new Server();
    }

    @Test
    public void testAge() {
        assertThat(guest.getAge() == 19);
    }

    @Test
    public void testServeGuest() {
        assertThat(guest.getDrunkenness() == 66);
    }

    @Test
    public void testCanAfford() {
        assertThat(guest.getMoney() == 10);
    }

    //public Currency currency = Currency.getInstance(Locale.ENGLISH);
    @Test
    public void testCurrency() {
        Currency currency = Currency.getInstance(Locale.ENGLISH);
        assertThat(guest.getCurrency(Locale.ENGLISH));
    }

}

    // TODO: test that guest can only get served if over 18

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    // TODO: test that guest can only get served if guest is not banned from the pub

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)


