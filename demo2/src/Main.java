import com.ctguqmx.controller.AdminController;
import com.ctguqmx.entity.Admin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static ApplicationContext apc = new ClassPathXmlApplicationContext("applicationContext.xml");
    private static AdminController adminController = (AdminController) apc.getBean("adminController");

    public static void addAdmin(){
        Admin admin = (Admin)apc.getBean("student");
        admin.setUsername("一个小邋遢");
        admin.setPassword("991028");
        adminController.addAdmin(admin);
    }
    public static void deleteAdmin(){
        Admin admin = (Admin)apc.getBean("student");
        admin.setUsername("1111");
        adminController.deleteAdmin(admin);


    }
    public static void updateAdmin(){
        Admin admin =(Admin)apc.getBean("student");
        admin.setId(2);
        admin.setUsername("keai");
        admin.setPassword("duiduidui");
        adminController.updateAdmin(admin);
    }
    public static Admin selectAdmin(){
        Admin admin = (Admin)apc.getBean("student");
//        admin.setId(3);
        admin.setUsername("一个小邋遢");
        admin.setPassword("991028");
        return adminController.selectAdmin(admin);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
//        addAdmin();
//        deleteAdmin();
//        updateAdmin();
//        selectAdmin();
        System.out.println(selectAdmin());
    }
}
