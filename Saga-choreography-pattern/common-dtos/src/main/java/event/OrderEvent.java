package common.dto;

public class OrderEvent {
	

	private OrderRequestDto orderRequestDto;
	
	private OrderStatus orderStatus;
	
	private UUID eventId=UUID.randomUUID();
	
	private Date date=new Date();

}
