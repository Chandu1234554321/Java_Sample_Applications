package com.example.demo.bean;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


public class OrderIdGenarator implements IdentifierGenerator{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private JdbcTemplate template;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		
		String suffix="";
		
		String prefix="TCS";
		try {
			//Connection con=null;//
			//Statement stmt=con.createStatement();
			//Statement stmt1=con.createStatement();
			String sql="select ORDID from order_id_seq";
			List<Map<String, Object>> list= template.queryForList(sql);
			int seqVal=0;
			int updatedVal=0;
			if(!list.isEmpty())
			{
				for(Map<String, Object> excelValue: list)
				{
					 seqVal=(int) excelValue.get("ORDID");
				}
			}
				
			suffix=String.valueOf(seqVal);
			 
			
			updatedVal=seqVal+1;
			String update="update order_id_seq set ORDID="+updatedVal+ " where ORDID="+seqVal+"";
			System.out.println(update);
			
			template.execute(update);
			System.out.println("Updated Successfully##################33");
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			
			System.out.println("###########Exceting Query SQL EXCEPTION");
			
		}
		
		return prefix+(String.valueOf(suffix));
	}

}
