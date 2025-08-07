import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        int[] Number = {00000, 11111, 22222, 33333, 44444, 55555, 66666, 77777, 88888, 99999};
        Scanner scanner = new Scanner(System.in);

        // เรียงลำดับข้อมูลด้วย Bubble Sort ก่อนทำ Binary Search
        bubbleSort(Number);

        System.out.print("Search ID: ");
        int targetID = scanner.nextInt();

        int index = binarySearch(Number, targetID);

        if (index != -1) {
            System.out.println("Found at Number[" + index + "]: " + targetID);
        } else {
            System.out.println("Not Found!");
        }
    }

    // Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Binary Search
    public static int binarySearch(int[] array, int target) {
        int first = 0;
        int last = array.length - 1;

        while (first <= last) {
            System.out.println("first: " + first + " last: " + last);

            int mid = first + (last - first) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return -1;
    }
}

```java
import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        int[] Number = {00000, 11111, 22222, 33333, 44444, 55555, 66666, 77777, 88888, 99999};
        Scanner scanner = new Scanner(System.in);

        // เรียงลำดับข้อมูลด้วย Bubble Sort ก่อนทำ Binary Search
        bubbleSort(Number);

        System.out.print("Search ID: ");
        int targetID = scanner.nextInt();

        int index = binarySearch(Number, targetID);

        if (index!= -1) {
            System.out.println("Found at Number[" + index + "]: " + targetID);
        } else {
            System.out.println("Not Found!");
        }
    }

    // Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Binary Search
    public static int binarySearch(int[] array, int target) {
        int first = 0;
        int last = array.length - 1;

        while (first <= last) {
            System.out.println("first: " + first + " last: " + last);

            int mid = first + (last - first) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return -1;
    }
}
```

คำอธิบายภาษาไทย:

- `import java.util.Scanner;` : นำเข้าคลาส Scanner จาก package java.util เพื่อใช้งานในการรับค่าที่ผู้ใช้ป้อน
- `public class Binarysearch {` : การประกาศคลาสที่ชื่อว่า "Binarysearch" ซึ่งเป็น public class
- `public static void main(String[] args) {` : เมธอดหลักที่จะเริ่มการทำงานของโปรแกรม
- `int[] Number = {00000, 11111, 22222, 33333, 44444, 55555, 66666, 77777, 88888, 99999};` : การสร้าง array ที่มีค่า ID ต่างๆ
- `Scanner scanner = new Scanner(System.in);` : การสร้าง object ของ Scanner เพื่อรับค่าที่ผู้ใช้ป้อน
- `bubbleSort(Number);` : เรียกใช้เมธอด bubbleSort ด้วย array ที่ต้องการเรียงลำดับ
- `System.out.print("Search ID: ");` : แสดงข้อความ "Search ID: " บน console เพื่อให้ผู้ใช้ป้อน ID
- `int targetID = scanner.nextInt();` : การเก็บค่าที่ผู้ใช้ป้อนในตัวแปร targetID
- `int index = binarySearch(Number, targetID);` : เรียกใช้เมธอด binarySearch ด้วย array และ ID ที่ผู้ใช้ป้อน แล้วเก็บผลลัพธ์ในตัวแปร index
- `if (index!= -1) {` : หากพบ ID ที่ต้องการค้นหาจะแสดงดัชนีของ ID นั้นใน array
- `System.out.println("Found at Number[" + index + "]: " + targetID);` : แสดงผลลัพธ์ของการค้นหา
- `else {` : หากไม่พบ ID ที่ต้องการค้นหา
- `System.out.println("Not Found!");` : แสดงข้อความ "Not Found!"
- `// Bubble Sort` : หัวข้อสำหรับเมธอด bubbleSort
- `public static void bubbleSort(int[] array) {` : เมธอดสำหรับการเรียงลำดับ array ในแบบ ascending order
- `int n = array.length;` : การกำหนดตัวแปรเพื่อเก็บขนาดของ array
- `for (int i = 0; i < n - 1; i++) {` : ลูปสำหรับการวนซ้ำผ่านแต่ละ element ใน array
- `for (int j = 0; j < n - i - 1; j++) {` : ลูปสำหรับการวนซ้ำผ่าน element ที่อยู่หลังจาก element ที่ i
- `if (array[j] > array[j + 1]) {` : หากพบ element ที่มีค่าน้อยกว่า element ที่อยู่หลัง
- `int temp = array[j];` : การกำหนดตัวแปรเพื่อเก็บค่าของ element ที่อยู่หลัง
- `array[j] = array[j + 1];` : การสลับค่าระหว่าง element ที่อยู่หลังและ element ที่อยู่หน้า
- `array[j + 1] = temp;` : การสลับค่าระหว่าง element ที่อยู่หลังและ element ที่อยู่หน้า
- `// Binary Search` : หัวข้อสำหรับเมธอด binarySearch
- `public static int binarySearch(int[] array, int target) {` : เมธอดสำหรับการค้นหา element ใน array ด้วยวิธีการ binary search
- `int first = 0;` : การกำหนดตัวแปรเพื่อเก็บดัชนีแรกของ array
- `int last = array.length - 1;` : การกำหนดตัวแปรเพื่อเก็บดัชนีสุดท้ายของ array
- `while (first <= last) {` : ลูปสำหรับการวนซ้ำผ่านการค้นหา element ใน array
- `int mid = first + (last - first) / 2;` : การคำนวณดัชนีกลางของ array
- `if (array[mid] == target) {` : หากพบ element ที่ต้องการค้นหา
- `return mid;` : คืนค่าดัชนีของ element ที่ต้องการค้นหา
- `else if (array[mid] < target) {` : หาก element ที่ต้องการค้นหามีค่ามากกว่า element ที่อยู่ที่ดัชนีกลาง
- `first = mid + 1;` : ก็จะเปลี่ยนค่าของ first เป็นดัชนีที่อยู่หลังดัชนีกลาง
- `else {` : หาก element ที่ต้องการค้นหามีค่าน้อยกว่า element ที่อยู่ที่ดัชนีกลาง
- `last = mid - 1;` : ก็จะเปลี่ยนค่าของ last เป็นดัชนีที่อยู่ก่อนดัชนีกลาง
- `return -1;` : หากไม่พบ element ที่ต้องการค้นหา
