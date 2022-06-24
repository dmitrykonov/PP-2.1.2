import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBean =
                (Cat) applicationContext.getBean("cat");

        Cat catBean2 =
                (Cat) applicationContext.getBean("cat");

        boolean compareBeans = bean == bean2;
        boolean compareCats = catBean == catBean2;

        System.out.println("comparison result for HelloWorld beans is " + compareBeans);
        System.out.println("comparison result for Cat beans is " + compareCats);

        System.out.println(bean.getMessage());
    }
}