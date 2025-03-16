# Binus-Data-Structure-1
## Team Assignment Week 3 - Data Structure and Algorithm Analysis

### Studi Kasus:
Kelompok diminta untuk membuat sistem manajemen perpustakaan sederhana. Dalam sistem ini, terdapat berbagai jenis pengguna, seperti admin dan anggota perpustakaan. Admin bertugas mengelola buku, sementara anggota dapat meminjam dan mengembalikan buku. Sistem ini harus mengelola data buku dan pengguna menggunakan konsep Object-Oriented Programming (OOP) serta array untuk operasi tertentu.

---

### Soal:

#### 1. Konsep OOP:
Implementasikan sistem manajemen perpustakaan ini menggunakan Java dengan menerapkan konsep Object-Oriented Programming (OOP) seperti inheritance dan polymorphism.

- Buatlah class `User` sebagai parent class, dengan class `Admin` dan class `Member` sebagai child class.
- Jelaskan bagaimana inheritance dan polymorphism digunakan dalam kasus ini.
- Sertakan **class diagram** yang menggambarkan hubungan antara kelas.

#### 2. Operasi pada Array menggunakan Java:
Sistem ini harus bisa mengelola daftar buku menggunakan array. Implementasikan fitur-fitur berikut:

- Menambahkan buku baru ke dalam perpustakaan.
- Menghapus buku dari perpustakaan.
- Mencari buku berdasarkan judul.

#### 3. Pengelolaan Data Buku:
Buat array untuk menyimpan data buku di perpustakaan. Buku harus memiliki atribut seperti judul, pengarang, dan status ketersediaan (tersedia atau dipinjam). Buat fungsi yang menggunakan array untuk:

- Menampilkan semua buku yang tersedia.
- Meminjam dan mengembalikan buku.

#### 4. Polymorphism pada Pengguna:
Buat metode polymorphic untuk menunjukkan perbedaan antara cara admin dan anggota berinteraksi dengan sistem. Misalnya, admin dapat menambah atau menghapus buku, sedangkan anggota hanya bisa meminjam atau mengembalikan buku.



### Jawaban:
#### 1. Konsep OOP:
##### 1a. 
##### 1b. Inheritance dan polymorphism digunakan dalam kasus ini
Inheritance adalah konsep yang memungkinkan admin untuk membuat kelas baru (subkelas) yang mewarisi atribut dan metode dari kelas lain (superkelas). Dengan kata lain, subkelas dapat mewarisi atau mendapatkan fitur-fitur yang ada di superkelas tanpa perlu menulis ulang kode yang sama. Sedangkan Polymorphism adalah kemampuan objek untuk mengambil banyak bentuk. Dalam Java, polimorfisme bisa diwujudkan dengan dua cara utama Method Overriding dan Method Overloading.
Dalam kasus sistem manajemen perpustakaan sederhana, kami dari group 6 mencoba membuat keduanya bekerja bersama untuk membuat sistem yang lebih fleksibel dan mudah dikelola. Inheritance memungkinkan kita untuk membuat kelas Admin dan Member yang mewarisi fungsionalitas umum dari kelas User (seperti atribut idUser dan metode login() dan logout()  ).
Polymorphism memungkinkan kelas Admin dan Member untuk memberikan implementasi yang berbeda untuk metode login() dan memanggilnya dengan cara yang sama pada objek dari kedua kelas tersebut. Ini memanfaatkan fitur umum (seperti login()) yang dapat berperilaku berbeda tergantung pada jenis objek yang memanggilnya.

##### 1c. Class Diagram

