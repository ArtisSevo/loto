package hello.it.loto.Lotteries;

import org.springframework.data.repository.CrudRepository;

public interface LotteryDao extends CrudRepository<Lottery, String> {
}
