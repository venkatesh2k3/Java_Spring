package com.intern.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class Delete_Service {
	@Autowired
		JdbcTemplate jt;
		public int delete(Insert e) {
			int id =e.getId();
			String sql ="delete from emp where id=?";
			int i= jt.update(sql,id);
			return i;
		}
	}

