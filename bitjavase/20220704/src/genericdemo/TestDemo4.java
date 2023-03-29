package genericdemo;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/4 22:03
 */
class Message<T> {
    private T message ;
    public T getMessage() {
        return message;
    }
    public void setMessage(T message) {
        this.message = message;
    }
}

public class TestDemo4 {
    public static void function() {
        //泛型 T 是确定的类型，一旦你传了我就定下来了
        Message<String> message = new Message<>() ;
        message.setMessage("比特就业课欢迎您");
        fun(message);
    }


    public static void main(String[] args) {
        Message<Integer> message = new Message<>() ;
        message.setMessage(1);
        fun(message);
    }

    //如果<>里不用通配符？，那里面是什么就能只能传什么类型，就不灵活了
    // 此时使用通配符"?"描述的是它可以接收任意类型，但是由于不确定类型，所以无法修改
    public static void fun(Message<?> temp){
        //temp.setMessage(1);是不能往里面加元素的，所以，源码当中用的比较多
        //ArrayList
        System.out.println(temp.getMessage());
    }

}
