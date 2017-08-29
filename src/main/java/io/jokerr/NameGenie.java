package io.jokerr;

/**
 * @author josh0445 <josh.kerr@rackspace.com>
 */
public class NameGenie {

    public String message(String name) {
        if(name == null) {
            throw new IllegalArgumentException("Name cannnot be null");
        }
        return "Hello " + name + ", your name is " + name.length() + " character(s) long.";
    }
}
