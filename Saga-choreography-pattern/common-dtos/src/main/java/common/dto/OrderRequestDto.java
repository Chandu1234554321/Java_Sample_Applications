package common.dto;

import event.OrderStatus;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDto {
	
	private Integer userId;
	
	private Integer productId;
	
	private Integer amount;
	
	private  Integer orderId;
	
	private OrderStatus orderStatus;
	
	
	
	
	

}
