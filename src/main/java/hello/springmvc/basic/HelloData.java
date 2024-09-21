package hello.springmvc.basic;

import lombok.Data;
import lombok.Setter;

@Data                   //@Getter,@Setter,@ToString,@EqualsAndHashCode,@RequiredArgsConstructor를 자동 적용
public class HelloData {
    private String username;
    private int age;
}
