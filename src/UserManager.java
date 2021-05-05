import org.apache.axis.AxisFault;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;

public class UserManager implements  UserService {
    public UserManager() {

    }

    private UserCheckService _userCheckService;

    public UserManager(UserCheckService userCheckService) {
        this._userCheckService = userCheckService;
    }


    @Override
    public void add(User user) throws Exception {
        if (_userCheckService.CheckIfRealPerson(user)) {
            System.out.println("Oyuncu eklendi : " + user.getId() + " " + user.getNationalityId() + " " +
                    user.getFirstName() + " " + user.getLastName() + " " + user.getDateOfBirth());
        } else {
            throw new Exception("Not a valid person");
        }
    }

    @Override
    public void update(User user) throws Exception {
        if (_userCheckService.CheckIfRealPerson(user)) {
            System.out.println("Oyuncu güncellendi : " + user.getId() + " " + user.getNationalityId() + " " +
                    user.getFirstName() + " " + user.getLastName() + " " + user.getDateOfBirth());
        } else {
            throw new Exception("Not a valid person");

        }

    }

    @Override
    public void delete(User user) throws Exception {

            if (_userCheckService.CheckIfRealPerson(user)) {
                System.out.println("Oyuncu silindi : " + user.getId() + " " + user.getNationalityId() + " " +
                        user.getFirstName() + " " + user.getLastName() + " " + user.getDateOfBirth());
            } else {
                throw new Exception("Not a valid person");

            }



    }
}
