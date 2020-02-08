package hello.it.loto.Lotteries;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class LotteryService {
    @Resource
    private LotteryDao lotteryDao;

    public Lottery createLottery(final LotteryDto lotteryDto) {
        Lottery lottery = new Lottery();
        lottery.setMaxLimit(lotteryDto.getLimit());
        lottery.setTitle(lotteryDto.getTitle());
        lottery.setStatus(LotteryStatus.OPEN);
        String datePattern = "dd.MM.yy HH:mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        lottery.setStartDate(simpleDateFormat.format(new Date()));
        lotteryDao.save(lottery);
        return lottery;
    }

    public List<Lottery> getAllLotteries(){
        List<Lottery> result= new ArrayList<>();
        for(Lottery lottery : lotteryDao.findAll()){
            result.add(lottery);
        }
       return result;
    }

}
