- tambahkan 
```
<uses-permission android:name="android.permission.INTERNET" />
```
di manifest
- tools->firebase->cloud messaging -> setup firebase cloud messaging
- ikuti tutorial disini : https://medium.com/@pplA2EDC/belajar-menggunakan-firebase-cloud-messaging-7f6bf3b42da7
catatan : 
- coba kirim message linknya ini : https://console.firebase.google.com
- jika log.d tidak  muncul, ganti dengan log.wtf
- coba di hp samsung dll. atau emulator, kalau di hp oppo gitu bermasalah karena androidnya oprekan

## subscribe topic
- jalankan perintah ini di activity :
```
//subscribe topic, jika perintah dibawah ini di eksekusi dia otomatis akan create topic naruto di firebase walaupun topic tersebut belum ada
FirebaseMessaging.getInstance().subscribeToTopic("naruto");
```
