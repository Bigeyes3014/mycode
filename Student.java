    /*      ① 定义学生类
            ② 主界面的代码编写
            ③ 添加学生的代码编写
            ④ 查看学生的代码编写
            ⑤ 删除学生的代码编写
            ⑥ 修改学生的代码编写*/
public class Student {
    private String name;
    private int sid;
    private int age;
    private String sex;
    public Student(){};
    public Student(String name,int sid,int age,String sex){
        this.name=name;
        this.sid=sid;
        this.age=age;
        this.sex=sex;
    }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSid() {
            return sid;
        }

        public void setSid(int sid) {
            this.sid = sid;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
    }
