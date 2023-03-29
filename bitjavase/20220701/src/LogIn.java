/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/2 15:01
 */

public class LogIn {
    private String userName = "admin";
    private String password = "123456";


    public void loginInfo(String userName, String password) {
        if (!this.userName.equals(userName)) {
// TODO 处理用户名错误
            throw new UserNameErrorExecption("我是用户名异常的参数");
        }
        if (!this.password.equals(password)) {
// TODO 处理密码错误、
            throw new PasswordErrorException("我是密码错误的异常的参数");
        }
        System.out.println("登陆成功");
    }

    public static void main(String[] args) {
        try {
            LogIn ad = new LogIn();
            ad.loginInfo("admin22", "123456");
        } catch (UserNameErrorExecption errorExecption) {
            errorExecption.printStackTrace();
            System.out.println("用户名异常");
        } catch (PasswordErrorException errorExecption){
            errorExecption.printStackTrace();
            System.out.println("密码异常");
        }
    }
}
