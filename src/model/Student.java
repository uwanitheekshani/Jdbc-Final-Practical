package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {
    String student_id;
    String student_name;
    String email;
    String contact;
    String address;
    String nic;

    public Student(String student_id, String student_name, String email, String contact, String address, String nic) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.nic = nic;
    }
}
