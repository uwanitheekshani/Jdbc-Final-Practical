package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    String student_id;
    String student_name;
    String email;
    String contact;
    String address;
    String nic;
}
