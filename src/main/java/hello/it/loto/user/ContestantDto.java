package hello.it.loto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContestantDto {
    private Long id;
    private String email;
    private Integer age;
    private String uniqueCode;
    private Long lotteryId;
}
