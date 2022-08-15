package com.demo.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import static org.springframework.data.repository.query.parser.Part.Type.LIKE;
@Repository
public interface persistingRoomRepository extends JpaRepository<persistingRoom, Long> {
    @Query(value = "SELECT p FROM persistingRoom p WHERE " +
            "lower(p.roomname) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.roomtype) LIKE lower(CONCAT('%', :keyword, '%')) OR " +
            "lower(p.roomfloor) LIKE lower(CONCAT('%', :keyword, '%'))")
    public List<persistingRoom> search(@Param("keyword") String keyword);
}