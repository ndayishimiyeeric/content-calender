package dev.nderic.contentcalender.repository;

import dev.nderic.contentcalender.model.Content;
import dev.nderic.contentcalender.model.Status;
import dev.nderic.contentcalender.model.Type;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class ContentJdbcTemplateRepository {
    private final JdbcTemplate jdbcTemplate;

    public ContentJdbcTemplateRepository(JdbcTemplate jdbcTemplate) { // dep injection
        this.jdbcTemplate = jdbcTemplate;
    }

    private static Content mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Content(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("desc"),
                rs.getString("url"),
                Status.valueOf(rs.getString("status")),
                Type.valueOf(rs.getString("content")),
                rs.getObject("date_created", LocalDateTime.class),
                rs.getObject("date_updated", LocalDateTime.class)
        );
    }

    public List<Content> findAll() {
        String sql = "SELECT * FROM Content";
        return jdbcTemplate.query(sql, ContentJdbcTemplateRepository::mapRow);
    }

    public Content findById(int id){
        String sql = "SELECT * FROM Content WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, ContentJdbcTemplateRepository::mapRow);
    }

    public void save(String title, String desc, String URL, Status status, Type contentType){
        String sql = "INSERT INTO Content (title, desc, url, status, content_type, date_created) VALUES (?, ?, ?, ?, ?, NOW())";
        jdbcTemplate.update(sql, title, desc, URL, status, contentType);
    }

    public void update(int id, String title, String desc, String URL, Status status, Type contentType){
        String sql = "UPDATE Content SET title=?, desc=?, url=?, status=?, content_type=?, date_updated=NOW() WHERE id=?";
        jdbcTemplate.update(sql, title, desc, URL, status, contentType, id);
    }

    public void deleteById(int id) {
        String sql = "DELETE FROM Content WHERE id=?";
        jdbcTemplate.update(sql, id);
    }
}
