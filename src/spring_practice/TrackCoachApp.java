package spring_practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TrackCoachApp {

    public static void main(String[] args) {

        // read spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);

        // get the bean from spring container
        Coach trackCoach = context.getBean("trackCoach", Coach.class);

        // call a method on the bean
        System.out.println("trackCoach said: " + trackCoach.getDailyWorkOut());

        // call method to get the daily fortune
         System.out.println("trackCoach said daily fortune: " + trackCoach.getDailyFortune());

        // close the context
        context.close();
    }

}
