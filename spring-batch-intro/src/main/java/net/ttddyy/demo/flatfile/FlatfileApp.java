package net.ttddyy.demo.flatfile;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tadaya Tsuyukubo
 */
public class FlatfileApp {

    public static void main(String[] args) throws Exception {

        ApplicationContext appCtx = new ClassPathXmlApplicationContext("classpath:/flatfile/applicationContext.xml");
        JobLauncher jobLauncher = appCtx.getBean(JobLauncher.class);
        Job job = appCtx.getBean(Job.class);

        Map<String, JobParameter> params = new HashMap<String, JobParameter>();
        params.put("csv_file", new JobParameter("classpath:/flatfile/2010-01-01.csv"));
//        params.put("csv_file", new JobParameter("classpath:/flatfile/2010-01-02.csv"));

        jobLauncher.run(job, new JobParameters(params));
    }

}
