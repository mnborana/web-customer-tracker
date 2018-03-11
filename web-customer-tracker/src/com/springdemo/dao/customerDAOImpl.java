package com.springdemo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springdemo.entity.Customer;

@Repository
public class customerDAOImpl implements CustomerDao{

	@Autowired
	private SessionFactory sessionFactory; 
	
	
	@Override
	@Transactional
	public List<Customer> getCustomer() {
		
		Session session = sessionFactory.getCurrentSession();
		
		List<Customer> customerList = session.createQuery("from customer").getResultList();
		System.out.println("cust list : "+customerList);
		return customerList;
	}
	
	
}
