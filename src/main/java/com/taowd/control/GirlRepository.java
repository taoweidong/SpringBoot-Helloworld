package com.taowd.control;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl, Integer> {

	// 通过年龄来查询
	public List<Girl> findByAge(Integer age);

}
