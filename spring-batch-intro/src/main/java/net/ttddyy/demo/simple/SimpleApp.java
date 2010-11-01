package net.ttddyy.demo.simple;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tadaya Tsuyukubo
 */
public class SimpleApp {

    public static void main(String[] args) throws Exception {
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("classpath:/simple/applicationContext.xml");
        JobLauncher jobLauncher = appCtx.getBean(JobLauncher.class);
        Job job = appCtx.getBean(Job.class);
        jobLauncher.run(job, new JobParameters());
    }
}
