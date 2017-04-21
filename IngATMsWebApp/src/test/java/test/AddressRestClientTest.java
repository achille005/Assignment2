package test;

import junit.framework.TestCase;
import java.util.List;
import org.junit.Test;
import demo.model.*;
import entities.Address;

public class AddressRestClientTest extends TestCase {

	@Test
	public void testFindAll() {
		AddressRestClient addressRestClient = new AddressRestClient();
		List<Address> addresses = addressRestClient.findAll();
		assertNotNull(addresses);
	}

}
