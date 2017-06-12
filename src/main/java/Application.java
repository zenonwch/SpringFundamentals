import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(final String[] args) {

		final CustomerService service = new CustomerServiceImpl();

		System.out.println(service.findAll().get(0).getFirstName());
	}
}
