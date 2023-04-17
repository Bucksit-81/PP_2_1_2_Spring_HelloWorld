import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) context.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = (HelloWorld) context.getBean("helloworld");
        System.out.println("Переменные ссылаются на один и тот же объект? " + (bean == bean2));

        Cat Cat1 = (Cat) context.getBean("cat");
        Cat Cat2 = (Cat) context.getBean("cat");
        System.out.println(Cat1.getMessage());
        System.out.println("Переменные ссылаются на один и тот же объект? " + (Cat1 == Cat2));
    }
}