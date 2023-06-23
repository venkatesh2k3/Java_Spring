package com.intern.jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class Select_Service {
	@Autowired
	JdbcTemplate jt;
	public List select() {
		List l =new ArrayList();
		HashMap hm =null;
		List<Map<String,Object>>ls =new ArrayList<Map<String,Object>>();	
		String sql = "select * from emp";
		ls= jt.queryForList(sql);
		for(Map m : ls) {
			hm= new HashMap();
			hm.put("id",m.get("id"));
			hm.put("name",m.get("ename"));
			hm.put("age", m.get("age"));
			hm.put("email", m.get("mail"));
			hm.put("role",m.get("erole"));
			l.add(hm);
			}
		return l;
	}
	
	}
