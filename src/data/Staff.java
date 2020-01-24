package data;

import com.company.CIS;// เรียกใช้ class ต่างแพ็คเกจ
import com.company.Student;

public class Staff extends CIS { // สร้าง class ในแพ้คเกจใหม่ชื่อ data
    public static void main(String[] args) {
        CIS cs = new CIS();
        System.out.println(cs.facaulty); // protected เรียกต่างแพ็คเกกจไม่ได้
        System.out.println(cs.cis);
    }

}
