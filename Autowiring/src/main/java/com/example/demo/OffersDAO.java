package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


@Component("DAO")
public class OffersDAO {
	
	
	private JdbcTemplate jdbcTemplate;
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


@Autowired
// this come from data source bean in xml
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}



	public List<Offer> getOffers()
	{
		return this.jdbcTemplate.query("select *from offers", new RowMapper<Offer>() {

			@Override
			public Offer mapRow(ResultSet rs, int rowum) throws SQLException {
				// TODO Auto-generated method stub
				
				Offer offer=new Offer();
				int id=rs.getInt("id");
				
				offer.setId(id);
				
				String name=rs.getString("name");
				offer.setName(name);
				
				String email=rs.getString("email");
				offer.setEmail(email);
				
				String text=rs.getString("text");
				offer.setText(text);
				
			   
				return offer;
				
				
				
			}
		});
		
		
	}

}
