import java.util.ArrayList;
import java.util.Scanner;

/*      ① 定义学生类
        ② 主界面的代码编写
        ③ 添加学生的代码编写
        ④ 查看学生的代码编写
        ⑤ 删除学生的代码编写
        ⑥ 修改学生的代码编写*/
public class StudentManageSystem {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            StartPage();
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    System.out.println("1、添加学生");
                    addStu(array);
                    break;
                case "2":
                    System.out.println("2、删除学生");
                    delStu(array);
                    break;
                case "3":
                    System.out.println("3、修改信息");
                    changeStu(array);
                    break;
                case "4":
                    System.out.println("4、查看所有");
                    lookAll(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    flag = false;
                    break;
            }
        }
    }

    public static void StartPage() {
        System.out.println("-----------学生管理系统-----------" +
                "\n1、添加学生\n2、删除学生\n3、修改信息\n4、查看所有\n5、退出\n请选择：");
    }

    public static void addStu(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("输入学生姓名");
        student.setName(sc.next());
        System.out.println("输入学生学号");
        student.setSid(sc.nextInt());
        System.out.println("输入学生年龄");
        student.setAge(sc.nextInt());
        System.out.println("输入学生性别");
        student.setSex(sc.next());
        array.add(student);
    }

    public static void delStu(ArrayList<Student> array) {
        System.out.println("选择要删除的学生");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (array.size() == 0) {
            System.out.println("请检查输入的学生名");
        } else {
            for (int i = 0; i < array.size(); i++) {
                Student student = array.get(i);
                if (student.getName().equals(s)) {
                    array.remove(i);
                    System.out.println("删除成功");
                }
            }
        }
    }


    public static void changeStu(ArrayList<Student> array) {
        System.out.println("选择要修改信息的学生");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (array.size() == 0)
            System.out.println("没有学生信息，请先录入");
        boolean flag = false; // 添加一个标志来表示是否找到了匹配的学生
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (s.equals(student.getName())) { //使用 equals() 方法比较字符串
                flag = true; // 标志置为 true 表示找到了匹配的学生
                System.out.println("输入修改后的姓名");
                student.setName(sc.nextLine());
                System.out.println("输入修改后的学号");
                student.setSid(sc.nextInt());
                System.out.println("输入修改后的年龄");
                student.setAge(sc.nextInt());
                System.out.println("输入修改后的性别");
                student.setSex(sc.next());
                array.set(i, student);
                break; // 修改：找到匹配的学生后退出循环
            }
        }
        if (!flag) { // 如果没有找到匹配的学生，则打印错误消息
            System.out.println("要修改的学生信息不存在");
        }
    }


    public static void lookAll(ArrayList<Student> array) {
        if (array.size() == 0)
            System.out.println("请先添加信息");
        else {
            System.out.println("姓名" + "\t\t" + "年龄" + "\t\t" + "学号" + "\t\t" + "性别");
            for (int i = 0; i < array.size(); i++) {
                Student student = array.get(i);
                System.out.println(student.getName() + "\t\t" + student.getAge() + "岁\t" + student.getSid() + "\t\t" + student.getSex());
            }
        }
    }
}
