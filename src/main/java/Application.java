import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(final String[] args) {

//		final CustomerService service = new CustomerServiceImpl();

		final ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		final CustomerService service = ctx.getBean("customerService", CustomerService.class);

		System.out.println(service.findAll().get(0).getFirstName());
	}
}
