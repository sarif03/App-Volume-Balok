# App-Volume-Balok

Project Pertama ini adalah Latihan untuk materi Activity yaitu membuat Aplikasi menghitung Volume Balok.

ScreenShot:
<br>
<img src="https://github.com/sarif03/App-Volume-Balok/blob/main/ss-Ap-%20Empty%20Field.png?raw=true" width="300">
<img src="https://github.com/sarif03/App-Volume-Balok/blob/main/ss-Ap-%20calculasi.png?raw=true" width="300">


## 📚 Penjelasan Singkat Activity: 📚
Activity merupakan komponen utama dalam pengembangan Aplikasi Android yang berfungsi menampilkan User interface (UI) kelayar Pengguna.

Anggaplah Activity ini adalah sebuah container/ kertas yang dimana fungsi kertas kita dapat menulis atau menggambar sesuatu didalamnya. layaknya kertas, Activity juga sifatnya sama seperti kertas kita dapat memasukkan komponen-komponen lain didalamnya seperti text, button, gambar, dll.

Pada Umumnya 1 Activity disertakan dgn 1 Layout XML.

Nah dalam pembuatan project baru pada Android Studio,biasanya kita akan diberikan 2 berkas yang akan dibuatkan secara otomatis, yaitu:<br>
- 1 buah berkas MainAcativity:
tempat membuat kode logic pada 1 Activity agar komponen didalanya dapat berfungsi sebagaimana mestinya.<br>
- 1 Buah berkas layout.xml:
tempat kita mengatur/memposisikan komponen Agar dapat tampil sesuai dgn design atau keinginan kita.

tentu saja dalam sebuah Aplikasi tidak mungkin hanya memiliki 1 halaman (Activity) oleh karena itu kita juga dapat membuat lagi berkas lain Activity & XML. dan menghubungkan sesama Activity agar dapat berpindah halaman dgn menggunakan #Intent.

Acitivity juga memiliki DaurHidup/Lifecycle untuk mengatur hidupnya, walau kita dapat merubah/mengatur ulang lifecycle dari sebuah activity, tapi menurut saya jarang kita merubah daurhidup dari sebuah activity,kecuali kita berada pada posisi membuat aplikasi yang lumayan kompleks. oleh karena itu, berikut lifecycle dari sebuah Activity :

