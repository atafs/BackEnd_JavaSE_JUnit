package bo;

import bo.exception.BOException;
import dao.Order;

public interface OrderBO {
	//SIGNATURE
	boolean placeOrder(Order order) throws BOException;
	boolean cancelOrder(int id) throws BOException;
	boolean deleteOrder(int id) throws BOException;

}
