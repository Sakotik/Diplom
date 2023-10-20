package ru.practicum.ewm.mapper;

import lombok.experimental.UtilityClass;
import org.springframework.jdbc.core.RowMapper;
import ru.practicum.ewm.ViewStats;

@UtilityClass
public class ViewStatsMapper {

    public RowMapper<ViewStats> mapRow() {
        return (rs, rowNum) -> ViewStats.builder()
                .app(rs.getString("app"))
                .uri(rs.getString("uri"))
                .hits(rs.getLong("hits"))
                .build();
    }
}
