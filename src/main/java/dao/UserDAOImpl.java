package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import entity.User;
import mapper.UserMapper;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDAOImpl (JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> getAll(){
        String sql = "SELECT * FROM users";
        return jdbcTemplate.query(sql, new UserMapper());
    }
}
