import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<PurchaseOrder,Integer> {

}
