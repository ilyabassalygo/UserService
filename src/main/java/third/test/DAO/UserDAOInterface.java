package third.test.DAO;

import third.test.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ILIA on 10.06.2016.
 */
public interface UserDAOInterface {
    public List<User> findAllUsers() throws SQLException;
   // public boolean addUser (int id,String name,String surname,String role) throws SQLException;
    public boolean updateUser (int id,String name,String surname,String role) throws SQLException;
    public boolean deleteUser (int id) throws SQLException;

}
