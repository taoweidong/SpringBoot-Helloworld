package com.taowd.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {

	@Autowired
	private GirlRepository girlRepository;

	@Autowired
	private GirlService girlService;

	/**
	 * 功能：查询所有信息
	 * 
	 * @return
	 */
	@GetMapping("/girls")
	public List<Girl> girlList() {

		return girlRepository.findAll();
	}

	/**
	 * 功能：新增信息
	 * 
	 * @param age
	 * @param name
	 * @return
	 */
	@PostMapping("/girls")
	public Girl girlAdd(@RequestParam("age") Integer age, @RequestParam("name") String name) {
		Girl girl = new Girl();
		girl.setAge(age);
		girl.setName(name);

		return girlRepository.save(girl);

	}

	/**
	 * 功能:查找一个员工信息
	 * 
	 * @return
	 */
	@GetMapping("/girls/{id}")
	public Girl firlFindOne(@PathVariable("id") Integer id) {
		return girlRepository.findOne(id);
	}

	// 更新
	@PutMapping("/girls/{id}")
	public Girl girlUpdate(@PathVariable("id") Integer id, @RequestParam("age") Integer age,
			@RequestParam("name") String name) {
		Girl girl = new Girl();
		girl.setId(id);
		girl.setAge(age);
		girl.setName(name);

		return girlRepository.save(girl);
	}

	// 删除
	@DeleteMapping("/girls/{id}")
	public void gilrDelete(@PathVariable("id") Integer id) {
		girlRepository.delete(id);
	}

	/**
	 * 功能：自定义查询，根据年龄查询
	 * 
	 * @param age
	 * @return
	 */
	@GetMapping("/girl/age/{age}")
	public List<Girl> girlQueryByAge(@PathVariable("age") Integer age) {
		return girlRepository.findByAge(age);
	}

	// ************事务的分析
	@PostMapping("/girlTwo")
	public void girlTwo() {
		girlService.insertTwo();
	}

}
