package net.ttddyy.demo.simple;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * @author Tadaya Tsuyukubo
 */
public class SimpleWriter implements ItemWriter<String> {
    public void write(List<? extends String> items) throws Exception {
        StringBuilder sb = new StringBuilder();

        for (String item : items) {
            sb.append(item);
            sb.append(", ");
        }

        System.out.println("Writer: " + sb.toString());
    }
}
