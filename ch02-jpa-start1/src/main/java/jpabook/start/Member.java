package jpabook.start;

import javax.persistence.*;  //**

/**
 * User: HolyEyE
 * Date: 13. 5. 24. Time: 오후 7:43
 */
@Entity          // 이 클래스를 테이블과 매핑한다.
@Table(name="MEMBER") // 매핑할 테이블 정보를 알려줌.
public class Member {

    @Id // 기본키 - 식별자 필드
    @Column(name = "ID") // 필드를 컬럼에 맵핑
    private String id;

    @Column(name = "NAME")
    private String username;

    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
