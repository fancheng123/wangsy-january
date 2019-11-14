package smile.wangsy.january.merchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author wangsy
 */
@SpringBootApplication
@MapperScan("smile.wangsy.january.*.mapper")
public class JanuaryMerchantApplication {

    public static void main(String[] args) {
        SpringApplication.run(JanuaryMerchantApplication.class, args);
    }
}
