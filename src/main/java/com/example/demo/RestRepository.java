package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RepositoryRestResource(path="visitor",collectionResourceRel = "visitor")
public interface RestRepository extends PagingAndSortingRepository<Visitor, Long>{
	
	List<Visitor> findByName(@Param("name") String name);
	
	@Query("select d from Visitor d where d.visitDate <= :visitDate")
    List<Visitor> findVisitDateBefore(@Param("visitDate") @DateTimeFormat(pattern="dd/MM/yyyy") Date visitDate); 
	
	@Query("select d from Visitor d where d.visitDate >= :visitDate")
    List<Visitor> findVisitDateAfter(@Param("visitDate") @DateTimeFormat(pattern="dd/MM/yyyy") Date visitDate);
	
	@Query("select d from Visitor d where d.visitTime between :startTime AND :endTime")
    List<Visitor> findVisitTimeBetween(
    		@Param("startTime") @DateTimeFormat(pattern="HH:mm") Date startTime,
    		@Param("endTime") @DateTimeFormat(pattern="HH:mm") Date endTime);
	
	@Query("select d from Visitor d where d.visitDate between :startDate AND :endDate")
    List<Visitor> findVisitDateBetween(
    		@Param("startDate") @DateTimeFormat(pattern="dd/MM/yyyy") Date startDate,
    		@Param("endDate") @DateTimeFormat(pattern="dd/MM/yyyy") Date endDate);
	
	
	//@GetMapping("/findBetweenDate")
//	List<Visitor> findBetweenDate(
//	      @RequestParam("startdate") @DateTimeFormat(pattern="dd/MM/yyyy") Date visitDate,
//	      @RequestParam("enddate") @DateTimeFormat(pattern="dd/MM/yyyy") Date visitTime); 
	
}
