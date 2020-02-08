package hello.it.loto.user;

import hello.it.loto.Lotteries.Lottery;
import org.springframework.data.repository.CrudRepository;

public interface ContestantDAO extends CrudRepository<Contestant, String> {
}
