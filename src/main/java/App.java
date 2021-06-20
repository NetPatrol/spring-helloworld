import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                applicationContext.getBean(HelloWorld.class);
        HelloWorld bean1 =
                applicationContext.getBean(HelloWorld.class);

        Cat nameless = applicationContext.getBean(Cat.class);
        bean.setMessage(String.format("Эй, %s! Кис-кис-кис! ", nameless.getName()));
        System.out.println(bean.getMessage() + nameless.getCatSpeak());

        Cat one = applicationContext.getBean(Cat.class);
        one.setName("Барсик");
        bean.setMessage(String.format("Эй, %s! Кис-кис-кис! ", one.getName()));
        System.out.println(bean.getMessage() + one.getCatSpeak());

        Cat two = applicationContext.getBean(Cat.class);
        two.setName("Васька");
        bean.setMessage(String.format("Эй, %s! Кис-кис-кис! ", two.getName()));
        System.out.println(bean.getMessage() + two.getCatSpeak());

        System.out.println("\n\nсравним котов:"); //false
        boolean comparison = one == two;
        System.out.println(comparison);
        System.out.println("сравним Helloworld:"); // true
        comparison = bean == bean1;
        System.out.println(comparison);
    }
}