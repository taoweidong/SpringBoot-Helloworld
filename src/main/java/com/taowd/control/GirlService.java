package com.taowd.control;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {

	@Autowired
	private GirlRepository girlRepository;

	//添加事务管理，测试时启动数据库后需要修改表结构
	@Transactional
	public void insertTwo() {
		Girl girl1 = new Girl();
		girl1.setAge(16);
		girl1.setName("S");
		girlRepository.save(girl1);

		Girl girl2 = new Girl();
		girl2.setAge(22);
		girl2.setName("王思2号啊收到了咯多久啊看來角度思考");
		girlRepository.save(girl2);

	}

}
