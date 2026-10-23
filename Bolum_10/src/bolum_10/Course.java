
package bolum_10;



public class Course {
    private String courseName;
    private String[] students = new String[2]; // Test için küçük bir başlangıç boyutu (otomatik artışı görmek kolaylaşır)
    private int numberOfStudents = 0;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    // 1. addStudent metodu: Yer kalmadığında dizinin boyutunu otomatik olarak artırır
    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            // Daha büyük yeni bir dizi oluştur (örneğin iki katı büyüklükte)
            String[] temp = new String[students.length * 2];
            // Eski dizideki verileri yeni diziye kopyala
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = student;
    }

    // 2. getStudents metodu: Sadece dersteki öğrenci sayısı kadar uzunlukta bir dizi döndürür
    public String[] getStudents() {
        String[] result = new String[numberOfStudents];
        System.arraycopy(students, 0, result, 0, numberOfStudents);
        return result;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    // 3. dropStudent metodu: Belirtilen öğrenciyi dersten çıkarır ve boşalan yere sonrakileri kaydırır
    public void dropStudent(String student) {
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            // Bulunan indeksten sonrakileri bir sola kaydır
            for (int i = index; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }
            students[numberOfStudents - 1] = null; // Son elemanı temizle
            numberOfStudents--;
        }
    }

    // 4. clear metodu: Tüm öğrencileri dersten siler
    public void clear() {
        students = new String[2]; // İlk boyutuna sıfırla veya boş dizi ata
        numberOfStudents = 0;
    }

    // --- Test Programı ---
    public static void main(String[] args) {
        // Bir ders oluştur
        Course course = new Course("Yazilim Muhendisligi");

        // Üç öğrenci ekle (Başlangıç kapasitesi 2 olduğu için otomatik genişleme test edilmiş olur)
        course.addStudent("Ahmet Yilmaz");
        course.addStudent("Ayse Demir");
        course.addStudent("Mehmet Kaya");

        System.out.println("--- Öğrenciler Eklendikten Sonra ---");
        String[] studentList = course.getStudents();
        for (int i = 0; i < studentList.length; i++) {
            System.out.println((i + 1) + ". " + studentList[i]);
        }
        System.out.println("Toplam öğrenci sayısı: " + course.getNumberOfStudents());

        // Bir öğrenciyi çıkar (Örn: Ayse Demir)
        course.dropStudent("Ayse Demir");

        System.out.println("\n--- Ayse Demir Çıkarıldıktan Sonra ---");
        studentList = course.getStudents();
        for (int i = 0; i < studentList.length; i++) {
            System.out.println((i + 1) + ". " + studentList[i]);
        }
        System.out.println("Toplam öğrenci sayısı: " + course.getNumberOfStudents());
    }
}