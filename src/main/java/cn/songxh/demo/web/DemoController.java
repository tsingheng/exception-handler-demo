package cn.songxh.demo.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author xiangheng.song
 * @date 2021/5/25 19:44
 */
@RestController
public class DemoController {

    @PostMapping("/demo")
    public DemoModel demo() {
        return new DemoModel();
    }

    static class DemoModel {

        private Date time = new Date();

        public Date getTime() {
            System.out.println(1/0);
            return time;
        }

        public void setTime(Date time) {
            this.time = time;
        }
    }
}
