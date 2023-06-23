package com.intern.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class Update_Service {
	@Autowired
			JdbcTemplate jt;
			public int update(Insert e) {
				int id =e.getId();
				String name=e.getEname();
				String sql ="update emp set ename=? where id =?" ;
				int i= jt.update(sql,name,id);
				return i;
				
			}
		}

