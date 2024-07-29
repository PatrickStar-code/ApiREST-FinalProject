package dio.ApiREST_FinalProject.domain;

import java.math.BigDecimal;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

import jakarta.persistence.Id;
@Entity(name = "tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true)
    private String number;
    
    @Column(name = "card_limit", scale = 2,precision = 13)
    private BigDecimal limit;

    @Column(name = "card_balance", scale = 2,precision = 13)
    private BigDecimal balance;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public BigDecimal getLimit() {
        return limit;
    }
    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    
}
