# LAMBDA
ref: https://mayojava.github.io/android/java/using-java8-lambda-expressions-in-android/ <br/>
intinya lambda digunakan untuk menyingkat penulisan sebuah syntaks, dan baru ada di java 8

## Cara Install

### build.gradle(Module:app) --> tambahkan compileOptions
```
defaultConfig {
        applicationId "irul.com.cobamethodlainlain"
        minSdkVersion 15
        targetSdkVersion 26
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }

compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
}
```

## Cara implementasi
Sebelum menggunakan lambda
```
btn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "tes", Toast.LENGTH_SHORT).show();
    }
});

```

Setelah menggunakan lambda
```
Button btn1 = (Button) findViewById(R.id.button1);
btn1.setOnClickListener(v -> Toast.makeText(this, "tes", Toast.LENGTH_SHORT).show());
```
