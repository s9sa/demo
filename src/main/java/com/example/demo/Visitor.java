package com.example.demo;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

/**
 * @author Kamarul Ashraf
 *
 */
@Entity
@Table(name = "visitor")
public class Visitor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "visitor_id")
	private Long visitorID;
	
	@Column
	private String name;
	
	@JsonFormat(pattern = "dd/MM/yyyy", shape = Shape.STRING)
	@Column(name = "visit_date")
	private Date visitDate;
	
	@JsonFormat(pattern = "HH:mm:ss", shape = Shape.STRING)
	@Column(name = "visit_time")
	private Time visitTime;
	
	public Long getVisitorID() {
		return visitorID;
	}
	public void setVisitorID(Long visitorID) {
		this.visitorID = visitorID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getVisitDate() { 
		return visitDate; 
	} 
	
	public void setVisitDate(Date visitDate) { 
		this.visitDate = visitDate; 
	}
	public Time getVisitTime() {
		return visitTime;
	}
	public void setVisitTime(Time visitTime) {
		this.visitTime = visitTime;
	}

	 
	
}
