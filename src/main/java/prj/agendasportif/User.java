package prj.agendasportif;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.springframework.boot.jackson.JsonComponent;

@Entity
@Table(name = "\"user\"")
@XmlRootElement
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int age;
    public User(){}

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @JsonProperty("id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @JsonProperty("age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "{" +
                "\"id\": " + id +
                ", \"name\": \"" + name + '\"' +
                ", \"age\": " + age +
                '}';
    }
}