package Sort;

public class SelectionSort {
    public static void selectionSortDescending(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {120, 60, 20, 80, 79, 30, 45};
        System.out.println("Unsorted Array: " + java.util.Arrays.toString(data));
        selectionSortDescending(data);
        System.out.println("Sorted Array in Descending Order: " + java.util.Arrays.toString(data));
    }
}

```java
package Sort;

public class SelectionSort {
    public static void selectionSortAscending(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {120, 60, 20, 80, 79, 30, 45};
        System.out.println("Unsorted Array: " + java.util.Arrays.toString(data));
        selectionSortAscending(data);
        System.out.println("Sorted Array in Ascending Order: " + java.util.Arrays.toString(data));
    }
}
```

คำอธิบายภาษาไทย:

- `package Sort;` : การจัดเก็บคลาสในโฟลเดอร์หรือแพ็กเกจที่ชื่อว่า "Sort"
- `public class SelectionSort {` : การประกาศคลาสที่ชื่อว่า "SelectionSort" ซึ่งเป็น public class
- `public static void selectionSortAscending(int[] data) {` : เมธอดสำหรับการเรียงลำดับ array ในแบบ ascending order
- `public static void selectionSortDescending(int[] data) {` : เมธอดสำหรับการเรียงลำดับ array ในแบบ descending order
- `for (int i = 0; i < data.length - 1; i++) {` : ลูปสำหรับการวนซ้ำผ่านแต่ละ element ใน array
- `int minIndex = i;` : การกำหนดตัวแปรเพื่อเก็บดัชนีของ element ที่มีค่าน้อยที่สุดในแต่ละรอบของลูป
- `for (int j = i + 1; j < data.length; j++) {` : ลูปสำหรับการวนซ้ำผ่าน element ที่อยู่หลังจาก element ที่ i
- `if (data[j] < data[minIndex]) {` : หากพบ element ที่มีค่าน้อยกว่า element ที่มีค่าน้อยที่สุดในรอบลูป
- `minIndex = j;` : ก็จะเปลี่ยนค่าของ minIndex เป็น index ของ element ที่มีค่าน้อยกว่า
- `int temp = data[minIndex];` : การกำหนดตัวแปรเพื่อเก็บค่าของ element ที่มีค่าน้อยที่สุด
- `data[minIndex] = data[i];` : การสลับค่าระหว่าง element ที่มีค่าน้อยที่สุดและ element ที่อยู่ที่ index i
- `data[i] = temp;` : การสลับค่าระหว่าง element ที่มีค่าน้อยที่สุดและ element ที่อยู่ที่ index i
- `int[] data = {120, 60, 20, 80, 79, 30, 45};` : การสร้าง array ที่มีค่าตัวอย่าง
- `System.out.println("Unsorted Array: " + java.util.Arrays.toString(data));` : แสดง array ที่ยังไม่ถูกเรียงลำดับ
- `selectionSortAscending(data);` : เรียกใช้เมธอด selectionSortAscending ด้วย array ที่ต้องการเรียงลำดับ
- `System.out.println("Sorted Array in Ascending Order: " + java.util.Arrays.toString(data));` : แสดง array หลังจากถูกเรียงลำดับในแบบ ascending order