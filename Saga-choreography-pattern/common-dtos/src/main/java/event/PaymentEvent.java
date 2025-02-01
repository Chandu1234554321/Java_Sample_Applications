package common.event;

public class PaymentEvent {
	
	private UUID eventId=UUID.randomUUID();
	
	private Date eventDate new Date();
	
	private PaymentRequestDto paymentRequestDto;
	
	private PaymentStatus paymentStatus;
	
	public UUID getEventId()
	{
		return eventId;
	}
	public Date getDate()
	{
		return eventDate;
	}
}
