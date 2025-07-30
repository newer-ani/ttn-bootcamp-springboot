package com.ttn.Spring_Boot.Assingments.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String name;

    @Embedded
//    @AttributeOverrides(
//            {
//                    @AttributeOverride(name = "streetNumber",column = @Column(name = "street_num")),
//                    @AttributeOverride(name = "location",column = @Column(name = "location_avail")),
//                    @AttributeOverride(name = "state", column = @Column(name ="residing_state"))
//            }
//    )
    private Address address;

    @ElementCollection
    private List<String> subject = new ArrayList<>();

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }
}
