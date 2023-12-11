import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2023/12/11  13:47
 * Description:
 */
public class Test2Constructor {
    @Test
    public void testGetConstructors() {
        // 1、反射第一步：获取Class对象
        Class c = Cat.class;
        // 2、获取所有构造方法  getConstructors()只能拿public修饰的
        //Constructor[] constructors = c.getConstructors();
        Constructor[] constructors = c.getDeclaredConstructors();
        // 3、遍历数组中的每个构造器对象
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "----->" + constructor.getParameterCount());
        }
    }

    @Test
    public void testGetConstructor() throws NoSuchMethodException {
        // 1、反射第一步：获取Class对象
        Class c = Cat.class;
        // 2、获取某个构造方法 getConstructor()只能拿public修饰的
        //Constructor constructor = c.getConstructor();
        Constructor constructor = c.getDeclaredConstructor(String.class, int.class);
        // 3、遍历数组中的每个构造器对象
        System.out.println(constructor.getName() + "----->" +
                constructor.getParameterCount());

    }

}
