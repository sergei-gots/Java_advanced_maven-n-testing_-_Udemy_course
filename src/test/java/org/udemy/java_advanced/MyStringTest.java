package org.udemy.java_advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

class MyStringTest {
    private MyString myString;
    private String string;
    @BeforeEach
    public void createNewMyString() {
        myString = new MyString();
        string = myString.getString();
    }

    @RepeatedTest(3)
    public void assumeStringMayContain_Z_ () {
        assumeTrue(string.contains("Z"), "myString.string does not contain 'Z'");
    }
    @RepeatedTest(3)
    public void assumeStringShouldContain_a_ () {
        assumeTrue(string.contains("a"), "myString.string does  contain 'a'");
    }
}