package view.tm;

import javafx.scene.control.Button;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerTM {
    String student_name;
    String email;
    String contact;
    String nic;
    Button delete;
    Button update;
}
