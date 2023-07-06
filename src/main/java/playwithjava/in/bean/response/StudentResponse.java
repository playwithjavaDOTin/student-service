package playwithjava.in.bean.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class StudentResponse {
    private String name;
    private String email;
    private Long grade;
    private Long studentId;
}
