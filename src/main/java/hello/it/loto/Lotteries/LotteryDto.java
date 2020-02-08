package hello.it.loto.Lotteries;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LotteryDto {
    private Long id;
    private String title;
    private int limit;
    private LotteryStatus status;
    private String startDate;
    private String endDate;
}
