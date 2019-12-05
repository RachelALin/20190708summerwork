package Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author linA
 * @company 启明星工作室
 * @create 2019/7/25
 */
public class user {

    private String name;
    private String schoolnum;
    private String college;
    private String majorin;
    private String qq;
    private String tel;
    private String group;
    private int id;

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolnum() {
        return schoolnum;
    }

    public void setSchoolnum(String schoolnum) {
        this.schoolnum = schoolnum;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajorin() {
        return majorin;
    }

    public void setMajorin(String majorin) {
        this.majorin = majorin;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", schoolnum='" + schoolnum + '\'' +
                ", college='" + college + '\'' +
                ", majorin='" + majorin + '\'' +
                ", qq='" + qq + '\'' +
                ", tel='" + tel + '\'' +
                ", group='" + group + '\'' +
                ", id=" + id +
                '}';
    }


}
