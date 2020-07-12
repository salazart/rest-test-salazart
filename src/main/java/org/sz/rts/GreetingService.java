package org.sz.rts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class GreetingService implements IGreetingService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Greeting addGreeting(Greeting greeting) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO greetings VALUES (DEFAULT, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, greeting.getContent());
            ps.setTimestamp(2, Timestamp.valueOf(greeting.getDateTime()));
            ps.setString(3, greeting.getIp());
            return ps;
        }, keyHolder);
        greeting.setId(keyHolder.getKey() == null ? 0 : keyHolder.getKey().longValue());
        return greeting;
    }

    @Override
    public List<Greeting> getAll() {
        return jdbcTemplate
                .query("SELECT id, content, dateTime, ip FROM greetings", (rs, rowNum) ->
                        new Greeting(
                                rs.getLong("id"),
                                rs.getString("content"),
                                rs.getTimestamp("dateTime").toLocalDateTime(),
                                rs.getString("ip")
                        ));
    }
}
