package ru.practicum.ewm.repository;

import org.springframework.jdbc.core.RowMapper;
import ru.practicum.ewm.ViewStats;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewStatsMapper implements RowMapper<ViewStats> {

    @Override
    public ViewStats mapRow(ResultSet rs, int rowNum) throws SQLException {
        return ViewStats.builder()
                .app(rs.getString("app"))
                .uri(rs.getString("uri"))
                .hits(rs.getInt("hits"))
                .build();
    }
}


