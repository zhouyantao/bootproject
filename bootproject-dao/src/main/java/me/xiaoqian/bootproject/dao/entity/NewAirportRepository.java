package me.xiaoqian.bootproject.dao.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface NewAirportRepository extends JpaRepository<NewAirport,Long>{
    @Query("from NewAirport p where p.airportCode like concat('%',concat(:airportCode,'%'))")
    NewAirport findByAirportCode(@Param("airportCode") String airportCode);
}
