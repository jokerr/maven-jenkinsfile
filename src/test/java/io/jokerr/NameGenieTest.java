package io.jokerr;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author josh0445 <josh.kerr@rackspace.com>
 */
public class NameGenieTest {

    private NameGenie genie;

    @Before
    public void setUp() {
        genie = new NameGenie();
    }

    @Test
    public void message() {
        assertEquals("Hello bob, your name is 3 character(s) long.", genie.message("bob"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void message_NullName() {
        genie.message(null);
    }
}