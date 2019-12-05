package com.ctgu.qmxjpa.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Alin
 * @packagename com.ctgu.qmxjpa.pojo
 * @date 2019/8/5
 * @time 20:52
 */
@ToString
@Getter
@DynamicInsert
@DynamicUpdate
@Setter
@Entity
@Table(name = "adminn")
//Serializable实现序列化
public class Admin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "realidentity")
    private String realidentity;
}
