package hello.it.loto.user;

import hello.it.loto.Lotteries.LotteryDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ContestantService {
    @Resource
    private ContestantDAO contestantDAO;

    public Contestant registerContestant(ContestantDto contestantDto){
        Contestant contestant = new Contestant();
        contestant.setAge(contestantDto.getAge());
        contestant.setEmail(contestantDto.getEmail());
        contestant.setLotteryId(contestantDto.getLotteryId());
        contestant.setUniqueCode(contestantDto.getUniqueCode());
        contestantDAO.save(contestant);
        return contestant;
    }
}
