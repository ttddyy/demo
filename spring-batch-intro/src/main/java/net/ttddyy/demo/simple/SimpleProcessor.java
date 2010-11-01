package net.ttddyy.demo.simple;

import org.springframework.batch.item.ItemProcessor;

/**
 * @author Tadaya Tsuyukubo
 */
public class SimpleProcessor implements ItemProcessor<String, String> {

    public String process(String item) throws Exception {
        System.out.println("Processor: " + item);
        return item + "-modified";
    }
}
