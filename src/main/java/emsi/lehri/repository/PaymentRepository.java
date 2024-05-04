package emsi.lehri.repository;

import emsi.lehri.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment findPaymentBy(long id);
}
