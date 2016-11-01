package com.wladek.pktcard.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;
import java.util.Set;

/**
 * Created by wladek on 1/1/10.
 */
@Entity
public class School extends AbstractModel{

    public static final String STRING_PATTERN = "^[a-zA-Z0-9-]+([_.][a-zA-Z0-9-]+)*$";

    @NotEmpty(message = "Provide school name")
    @Pattern(regexp = STRING_PATTERN, message = "Illegal character included in name")
    private String name;
    @NotEmpty(message = "Provide school code")
    @Pattern(regexp = STRING_PATTERN, message = "Illegal character included in code")
    private String code;

    @OneToMany(mappedBy = "school" , fetch = FetchType.LAZY)
    private Set<Student> students;

    @OneToMany(mappedBy = "school" , fetch = FetchType.LAZY)
    private Set<Item> items;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
