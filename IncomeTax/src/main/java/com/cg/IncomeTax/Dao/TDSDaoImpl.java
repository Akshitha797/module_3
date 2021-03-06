package com.cg.IncomeTax.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.IncomeTax.bean.TDSDetails;

@Component("dao")
@Repository
@ComponentScan("com")
public class TDSDaoImpl implements TDSDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public TDSDetails getById(int id) {
		TDSDetails tdsDetails = entityManager.find(TDSDetails.class, id);
		return tdsDetails;
	}

}
