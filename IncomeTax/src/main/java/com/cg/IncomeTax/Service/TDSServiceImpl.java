package com.cg.IncomeTax.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.IncomeTax.Dao.TDSDao;
import com.cg.IncomeTax.bean.TDSDetails;

@Component("service")
@Service
@Transactional

public class TDSServiceImpl implements TDSService {

	@Autowired
	TDSDao dao;

	@Override
	public TDSDetails getById(int id) {
		return dao.getById(id);
	}

}
