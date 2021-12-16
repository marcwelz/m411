import javax.persistence.*;

@Entity
@Table(name = "employee") public class Employee {
    @Id
    @Column(name = "id", unique = true)
    private int id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "departmentidfs")
    private Integer departmentidfs;

    public Employee(int id, String firstname, String lastname, Integer departmentidfs) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.departmentidfs = departmentidfs;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getDepartmentidfs() {
        return departmentidfs;
    }

    public void setDepartmentidfs(Integer departmentidfs) {
        this.departmentidfs = departmentidfs;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", departmentidfs=" + departmentidfs +
                '}';
    }
}



