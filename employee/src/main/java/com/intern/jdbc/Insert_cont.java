package com.intern.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Insert_cont {
@Autowired
Insert_Service is;

@PostMapping("emp-insert")
public String insert (@RequestBody Insert in) {
	int i=is.insert(in);
	if(i>0)
	{
		return "Data inserted";
	}
	else
	{Delete_Service ds;
		return "not inserted";
		
	}
	
}
@Autowired
Delete_Service ds;
@DeleteMapping("emp-delete")
public String delete (@RequestBody Insert in) {
	int i=ds.delete(in);
	if(i>0)
	{
		return "Data inserted";
	}
	else
	{
		return "not inserted";
		
	}

}

@Autowired
Update_Service us;
@PutMapping("emp-update")
public String update (@RequestBody Insert in) {
	int i=us.update(in);
	if(i>0)
	{
		return "Data inserted";
	}
	else
	{
		return "not inserted";
		
	}

}
}
