package ejb;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import java.util.Date;

@Singleton
public class TimerService {

    @Schedule(second="13,34,57", minute="*",hour="*", persistent=false)
    public void doWork(){
        System.out.println("Execution Time : " + new Date());
    }

}
