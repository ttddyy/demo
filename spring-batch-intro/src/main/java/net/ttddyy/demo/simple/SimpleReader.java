package net.ttddyy.demo.simple;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/**
 * @author Tadaya Tsuyukubo
 */
public class SimpleReader implements ItemReader<String> {
    private static int count = 0;

    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if (count > 10) return null;

        String str = "input-" + count++;

        System.out.println("Reader: " + str);
        return str;
    }
}
