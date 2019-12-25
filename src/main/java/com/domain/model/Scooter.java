package com.domain.model;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Scooter {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
 private Long id;

 private String modelName;
 private int maxSpeed;

 private BigDecimal price;

 private DockStation dockStation;

private UserAccount userAccount;
private List<Rental> rentals;
}
