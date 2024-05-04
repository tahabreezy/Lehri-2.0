package emsi.lehri.services;

import emsi.lehri.entities.Payment;
import emsi.lehri.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
private PaymentRepository paymentRepository;
public PaymentService(PaymentRepository paymentRepository) {
    this.paymentRepository = paymentRepository;
}
public void AddPayment(Payment payment) {
    paymentRepository.save(payment);
}
}
