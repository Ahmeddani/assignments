package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;

public class JDBCDepartmentDAO implements DepartmentDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public List<Department> getAllDepartments() {
<<<<<<< HEAD
		List<Department> departments = new ArrayList<Department>();
		
		String selectDepartments = "select department_id, name from department";
		SqlRowSet results = jdbcTemplate.queryForRowSet(selectDepartments);
		
		while(results.next()) {
		
			Department department = mapDepartmentToRows(results);
			departments.add(department);
		}
=======
		
		List<Department> departments = new ArrayList<Department>();
		
		String sql = "Select department_id, name FROM department";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		
		while (results.next()) {
			Department department = mapRowToDepartment(results);
			departments.add(department);
		}
		
>>>>>>> f224f1587b4e5a69363b4be9bd346f2b8264412b
		return departments;
	}

	

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {
		List<Department> departments = new ArrayList<Department>();
		String searchDepartment = "select department_id, name from department where name ILIKE ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(searchDepartment, nameSearch);
		
		while (result.next()) {
			Department department = mapDepartmentToRows(result);
			departments.add(department);
		}
		return departments;
	}

	@Override
	public void saveDepartment(Department updatedDepartment) {
		
		String saveDepartmentSql = "update department set name = ? where department_id = ?";
		jdbcTemplate.update(saveDepartmentSql, updatedDepartment.getName(), updatedDepartment.getId());
		
		
	}

	@Override
	public Department createDepartment(Department newDepartment) {
		
		String createNewDepartment = "insert into department (name) values (?)"; 
		Long id = getNextDepartmentId();
		jdbcTemplate.update(createNewDepartment, newDepartment.getName());
		newDepartment.setId(id);
		return newDepartment;
	}

	@Override
	public Department getDepartmentById(Long id) {
		
		Department department = new Department();
		String getDepartmentSql = "select department_id, name from department where department_id = ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(getDepartmentSql, id);
		
		while (result.next()) {
			department = mapDepartmentToRows(result);
			
		}
		
		return department;
	}
	
	private Department mapDepartmentToRows(SqlRowSet results) {
		
		Department department = new Department();
		department.setId(results.getLong("department_id"));
		department.setName(results.getString("name"));
		return department;
	}
	
<<<<<<< HEAD
	private Long getNextDepartmentId() {
	
			SqlRowSet nextIdResult = jdbcTemplate.queryForRowSet("SELECT nextval('seq_department_id')");
			if(nextIdResult.next()) {
				return nextIdResult.getLong(1);
			} else {
				throw new RuntimeException("Something went wrong while getting an id for the new department");
			}
		}
=======
	private Department mapRowToDepartment(SqlRowSet result) {
		Department department = new Department();
		department.setId(result.getLong("department_id"));
		department.setName(result.getString("name"));
		return department;
	}
>>>>>>> f224f1587b4e5a69363b4be9bd346f2b8264412b

}


