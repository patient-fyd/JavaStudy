/**
 * @Author: Fourteen-Y
 * @Description: 自定义异常，需要继承与一个异常类，一般我们建议继承2个中的一个
 * 1、Exception 【默认就是一个受查异常，或者是一个编译时异常，，必须”处理“之后，才能运行】
 *
 * @Date: 2022/7/2 16:03
 */
public class UserNameErrorExecption extends RuntimeException {
    public UserNameErrorExecption(){
        super();
    }

    public UserNameErrorExecption(String massage){
        super(massage);
    }
}
