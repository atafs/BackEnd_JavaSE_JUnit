package dao;

import java.sql.SQLException;

//INTERFACE
public interface OrderDAO {
	//SIGNATURES
	int create(Order order) throws SQLException;
	Order read(int id) throws SQLException;
	int update(Order order) throws SQLException;
	int delete(int id) throws SQLException;
	
}
