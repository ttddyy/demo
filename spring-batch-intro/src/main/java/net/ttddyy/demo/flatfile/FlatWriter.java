package net.ttddyy.demo.flatfile;

import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.transform.FieldSet;

import java.util.List;

/**
 * @author Tadaya Tsuyukubo
 */
public class FlatWriter implements ItemWriter<FieldSet> {

    public void write(List<? extends FieldSet> items) throws Exception {

        for (FieldSet item : items) {
            System.out.println("writer: " + item);
        }

    }

}
