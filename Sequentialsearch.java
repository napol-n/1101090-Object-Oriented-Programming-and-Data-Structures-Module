package Search;

import java.util.Scanner;

public class Sequentialsearch {
    public static void main(String[] args) {
        int[] A = {10001, 10022, 10060, 11255, 15022, 20001, 21002, 23003, 25566, 30078, 40000, 50012, 66006};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input ID: ");
        int index = sequentialSearch(A, scanner.nextInt());
        System.out.println(index != -1 ? "Found at A[" + index + "]" : "Not Found!");
    }

    public static int sequentialSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }
}

package Search; : การจัดเก็บคลาสในโฟลเดอร์หรือแพ็กเกจที่ชื่อว่า "Search"
import java.util.Scanner; : นำเข้าคลาส Scanner จาก package java.util เพื่อใช้งานในการรับค่าที่ผู้ใช้ป้อน
public class Sequentialsearch { : การประกาศคลาสที่ชื่อว่า "Sequentialsearch" ซึ่งเป็น public class
public static void main(String[] args) { : เมธอดหลักที่จะเริ่มการทำงานของโปรแกรม
int[] A = {10001, 10022, 10060, 11255, 15022, 20001, 21002, 23003, 25566, 30078, 40000, 50012, 66006}; : การสร้าง array ที่มีค่า ID ต่างๆ
Scanner scanner = new Scanner(System.in); : การสร้าง object ของ Scanner เพื่อรับค่าที่ผู้ใช้ป้อน
System.out.print("Input ID: "); : แสดงข้อความ "Input ID: " บน console เพื่อให้ผู้ใช้ป้อน ID
int index = sequentialSearch(A, scanner.nextInt()); : เรียกใช้เมธอด sequentialSearch ด้วย array และ ID ที่ผู้ใช้ป้อน แล้วเก็บผลลัพธ์ในตัวแปร index
System.out.println(index!= -1? "Found at A[" + index + "]" : "Not Found!"); : แสดงผลลัพธ์ของการค้นหา ถ้าพบ ID ที่ต้องการค้นหาจะแสดงดัชนีของ ID นั้นใน array แต่ถ้าไม่พบจะแสดงข้อความ "Not Found!"
public static int sequentialSearch(int[] array, int target) { : เมธอด sequentialSearch ที่รับ array และ target เป็น parameter
for (int i = 0; i < array.length; i++) { : ลูปสำหรับการวนซ้ำผ่านแต่ละ element ใน array
if (array[i] == target) return i; : หากพบ element ที่เท่ากับ target จะคืนค่า index ของ element นั้น
return -1; : หากไม่พบ target ใน array จะคืนค่า -1
