package order.entity;

@Entity
@Table(name="PURCHASE_ORDER_TBL")
public class PuchaseOrder {
	
	@Id
	@GeneratedValue(stratagy="AUTO")
	@Data
	@AllargsConstructor
	@NoArgsConstructor
	private Integer poId;
	
	private Integer userId;
	
	private Integer productId;
	
	private Integer price;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;
	@Enumerated(EnumType.STRING)
	private Payment paymentStatus;
	

}
