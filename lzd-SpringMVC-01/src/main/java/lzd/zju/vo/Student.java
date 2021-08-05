package lzd.zju.vo;

/**
 * @author:liuzidi
 * @Description:
 */
public class Student{
    //属性名和请求中参数名要一致
    private String name;
    private Integer age;

    public Student() {
        System.out.println("=== student类无参构造方法 ===");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setName:"+name);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
        System.out.println("setAge:"+age);
    }
}
