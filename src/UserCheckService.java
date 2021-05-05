import org.apache.axis.AxisFault;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;

public interface UserCheckService {

    boolean CheckIfRealPerson(User user) throws AxisFault, MalformedURLException, ServiceException;

}
