package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	//apenas 1 copia do sdf para a aplicação inteira e não 1 copia para cada postagem 
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	
	//como order tem varios itens vamos representar com uma lista
	private List<OrderItem> items = new ArrayList<>();
	

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public List<OrderItem> getItems() {
		return items;
	}

	//adicionar na lista o item que veio como argumento
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
		
	//remover o item informado da lista
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	//calcular o total do pedido
	public double total() {
		double sum = 0.0;
		
		for (OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY \n");
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order Items: ");
		
		//valor de cada pedido
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
		
		

}
