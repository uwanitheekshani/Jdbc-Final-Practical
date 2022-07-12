package view.tm;

import javafx.scene.control.Button;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentTM {
    String student_id;
    String student_name;
    String email;
    String contact;
    String address;
    String nic;
    Button delete;
    Button update;
}
