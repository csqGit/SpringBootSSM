package com.csq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csq.entity.Happiness;
import com.csq.mapper.HappinessMapper;

@Service
public class HappinessService {

	@Autowired
	private HappinessMapper happinessMapper;
	
	public Happiness selectHappinessByCity(String city) {
		
		return happinessMapper.findHappinessByCity(city);
	}
	
	
	
	/**
	 * 事务管理只需要在方法上加个注解：@Transactional
	 * @param city
	 * @param num
	 * @return
	 */
//	@Transactional
	public int insertHappiness(String city, int num) {
		
		return happinessMapper.insertHappiness(city, num);
	}
	
	
}
