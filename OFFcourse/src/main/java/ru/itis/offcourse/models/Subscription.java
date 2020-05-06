package ru.itis.offcourse.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "subscription")
    private List<User> users;

    @ManyToMany(mappedBy = "subscriptions")
    private List<SubsType> subsTypes;

}
