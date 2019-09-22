package orm;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "studentTable")
public class StudentEntity {

    @Id
    int id;
    String name;
    @Column(name = "PhoneNumber")
    String phoneNo;

    @Override
    public String toString() {
        return "\n{\"id\" : "+ id + ",\n\"name\" : \"" + name + "\"" + ",\n\"PhoneNo\" : \"" + phoneNo + "\"" +"\n}";
    }
}

