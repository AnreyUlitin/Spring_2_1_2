import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    private static Object HelloWorld;
    private static Object Cat;

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean1.getMessage());

        AnnotationConfigApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean2 = (Cat) applicationContext1.getBean("cat");
        Cat bean3 = (Cat) applicationContext1.getBean("cat");


        boolean comparision =  bean == bean1;

        boolean comparision1 =  bean2 == bean3;

        boolean comparision2 = HelloWorld == Cat;


        System.out.println(bean2.getName());
        System.out.println(bean3.getName());

        System.out.println(comparision);
        System.out.println(comparision1);
        System.out.println(comparision2);

    }
}