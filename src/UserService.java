import org.apache.axis.AxisFault;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;

public interface UserService {
    void add(User user) throws AxisFault, ServiceException, MalformedURLException, Exception;
    void update(User user) throws Exception;
    void delete(User user) throws Exception;
}
