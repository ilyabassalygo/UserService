package third.test.DAO;

import third.test.model.User;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by ILIA on 10.06.2016.
 */
public class UserDAOImpl implements UserDAOInterface {

    private String dbURL = "jdbc:mysql://localhost:3306/userbase";
    private String username = "root";
    private String password = "2623438i";

    public ArrayList<User> findAllUsers() throws SQLException {

        Connection conn = DriverManager.getConnection(dbURL,username,password);

        String sql = "SELECT * FROM User";

        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);

        int count = 0;
        ArrayList<User> userList = new ArrayList<User>();

        while (result.next()){
            User user = new User();
            user.setIdUser(result.getInt(1));
            user.setName(result.getString(2));
            user.setSurname(result.getString(3));
            user.setRole(result.getString(4));

            userList.add(user);
        }

        conn.close();

        return userList;
    }

   /* public boolean addUser(int id, String name, String surname, String role) throws SQLException {

        Connection conn = DriverManager.getConnection(dbURL,username,password);

        String sql = "INSERT INTO User (idUser, name, surname, role) VALUES (?, ?, ?, ?)";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1,id);
        statement.setString(2, name);
        statement.setString(3, surname);
        statement.setString(4, role);

        int rowsInserted = statement.executeUpdate();

        return true;
    }*/

    public boolean updateUser(int id, String name, String surname, String role) throws SQLException {

        Connection conn = DriverManager.getConnection(dbURL,username,password);

        String sql = "UPDATE user SET name = ?, surname = ?,role = ? where idUser = ?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1,name);
        statement.setString(2,surname);
        statement.setString(3,role);
        statement.setInt(4,id);

        statement.executeUpdate();

        return true;
    }

    public boolean deleteUser(int id) throws SQLException {

        Connection conn = DriverManager.getConnection(dbURL,username,password);

        String sql = "DELETE FROM user WHERE idUser=?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, "id");

        statement.executeUpdate();

        return true;
    }
}
