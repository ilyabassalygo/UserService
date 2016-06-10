package third.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import third.test.DAO.UserDAOImpl;
import third.test.model.User;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by ILIA on 10.06.2016.
 */
@RestController
public class UserService  {
    @RequestMapping(value = "/users",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ArrayList<User>> findAllUsers() throws SQLException {
        ArrayList<User> userList = new ArrayList<User>();
        UserDAOImpl udi = new UserDAOImpl();
        userList = udi.findAllUsers();

        return new ResponseEntity<ArrayList<User>>(userList, HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteUser(@PathVariable("id") int id) throws SQLException {
        UserDAOImpl udi = new UserDAOImpl();
        udi.deleteUser(id);
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }
}
