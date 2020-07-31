package io.codedifferently;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class OpenCloseCheckerTest {
   // OpenCloseChecker oc = new OpenCloseChecker();
    @Test
    public void test1() {
        String Sentence = "{ <({[['']]})>}";
       // assertTrue(wc.openClose(Sentence));
        assertTrue( OpenCloseChecker.openClose(Sentence));
    }
    @Test
    public void test2() {
        String Sentence = "{}";
        assertTrue(OpenCloseChecker.openClose(Sentence));
    }
//    @Test public void testFileRead() {
//        wc.readWords(Arrays.asList("Avengers", "Endgame", "Infinity War"));
//        assertEquals(26, wc.numWords());
//        assertEquals(9,wc.longestWord().length());
//    }

}