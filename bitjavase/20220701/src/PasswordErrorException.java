/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/2 16:12
 */
public class PasswordErrorException extends RuntimeException {
    public PasswordErrorException(){
        super();
    }

    public PasswordErrorException(String massage2){
        super(massage2);
    }
}
