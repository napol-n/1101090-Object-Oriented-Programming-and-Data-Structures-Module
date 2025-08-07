package Sort;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSortDescending(int[] data) {
        for (int i = 0, n = data.length; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of integers to sort: ");
        int[] data = new int[scanner.nextInt()];

        System.out.println("Enter " + data.length + " integers:");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter " + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }

        bubbleSortDescending(data);

        System.out.println("Sorted list of numbers:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Data " + (i + 1) + ": " + data[i]);
        }
    }
}

```java
package Sort;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSortAscending(int[] data) {
        for (int i = 0, n = data.length; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of integers to sort: ");
        int[] data = new int[scanner.nextInt()];

        System.out.println("Enter " + data.length + " integers:");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter " + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }

        bubbleSortAscending(data);

        System.out.println("Sorted list of numbers:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Data " + (i + 1) + ": " + data[i]);
        }
    }
}
```

คำอธิบายภาษาไทย:

- `package Sort;` : การจัดเก็บคลาสในโฟลเดอร์หรือแพ็กเกจที่ชื่อว่า "Sort"
- `import java.util.Scanner;` : นำเข้าคลาส Scanner จาก package java.util เพื่อใช้งานในการรับค่าที่ผู้ใช้ป้อน
- `public class BubbleSort {` : การประกาศคลาสที่ชื่อว่า "BubbleSort" ซึ่งเป็น public class
- `public static void bubbleSortAscending(int[] data) {` : เมธอดสำหรับการเรียงลำดับ array ในแบบ ascending order
- `public static void bubbleSortDescending(int[] data) {` : เมธอดสำหรับการเรียงลำดับ array ในแบบ descending order
- `for (int i = 0, n = data.length; i < n - 1; i++) {` : ลูปสำหรับการวนซ้ำผ่านแต่ละ element ใน array
- `boolean swapped = false;` : ตัวแปรเพื่อตรวจสอบว่ามีการสลับค่าระหว่าง element หรือไม่
- `for (int j = 0; j < n - i - 1; j++) {` : ลูปสำหรับการวนซ้ำผ่าน element ที่อยู่หลังจาก element ที่ i
- `if (data[j] > data[j + 1]) {` : หากพบ element ที่มีค่าน้อยกว่า element ที่อยู่หลัง
- `int temp = data[j];` : การกำหนดตัวแปรเพื่อเก็บค่าของ element ที่อยู่หลัง
- `data[j] = data[j + 1];` : การสลับค่าระหว่าง element ที่อยู่หลังและ element ที่อยู่หน้า
- `data[j + 1] = temp;` : การสลับค่าระหว่าง element ที่อยู่หลังและ element ที่อยู่หน้า
- `if (!swapped) break;` : หากไม่มีการสลับค่าในรอบลูป ก็จะหยุดการทำงานของลูป
- `Scanner scanner = new Scanner(System.in);` : การสร้าง object ของ Scanner เพื่อรับค่าที่ผู้ใช้ป้อน
- `System.out.print("Input number of integers to sort: ");` : แสดงข้อความ "Input number of integers to sort: " บน console เพื่อให้ผู้ใช้ป้อนจำนวน integer
- `int[] data = new int[scanner.nextInt()];` : การสร้าง array ที่มีขนาดเท่ากับจำนวน integer ที่ผู้ใช้ป้อน
- `System.out.println("Enter " + data.length + " integers:");` : แสดงข้อความ "Enter " + data.length + " integers: " บน console เพื่อให้ผู้ใช้ป้อน integer
- `for (int i = 0; i < data.length; i++) {` : ลูปสำหรับการวนซ้ำผ่านแต่ละ element ใน array
- `System.out.print("Enter " + (i + 1) + ": ");` : แสดงข้อความ "Enter " + (i + 1) + ": " บน console เพื่อให้ผู้ใช้ป้อน integer
- `data[i] = scanner.nextInt();` : การเก็บค่าที่ผู้ใช้ป้อนใน array
- `bubbleSortAscending(data);` : เรียกใช้เมธอด bubbleSortAscending ด้วย array ที่ต้องการเรียงลำดับ
- `System.out.println("Sorted list of numbers:");` : แสดงข้อความ "Sorted list of numbers: " บน console
- `for (int i = 0; i < data.length; i++) {` : ลูปสำหรับการวนซ้ำผ่านแต่ละ element ใน array
- `System.out.println("Data " + (i + 1) + ": " + data[i]);` : แสดงค่าของ element ที่อยู่ใน index i
