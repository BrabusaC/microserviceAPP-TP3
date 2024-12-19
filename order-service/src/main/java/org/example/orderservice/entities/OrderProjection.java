package org.example.orderservice.entities;
import org.example.orderservice.enums.OrderStatus;
import org.springframework.data.rest.core.config.Projection;
import java.util.Date;
@Projection(name="fullOrder",types = org.example.orderservice.entities.Order.class)
public interface OrderProjection {
    Long getId();
    Date getCreatedAt();
    Long getCustomerId();
    OrderStatus getStatus();
}
