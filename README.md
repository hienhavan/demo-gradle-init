# Gradle Java Basic Project

## Giới thiệu
Dự án cơ bản được quản lý bằng Gradle (gradle init). Dự án sử dụng thư viện `commons-lang3` để xử lý chuỗi.

## hệ thống
- Java 8 
- Gradle 8.x

## Cài đặt và chạy dự án
### 1. Khởi tạo dự án Gradle
```sh
gradle init
```
Chọn:
- Application project (Single application project)
- Java
- JUnit Jupiter 

### 2. Thêm dependency vào `build.gradle`
Mở file `build.gradle` và thêm:
```gradle
plugins {
    id 'java'
    id 'application'
}

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.apache.commons:commons-lang3:3.14.0'
}

application {
    mainClass = 'Main'
}
```

### 3. Tạo file `Main.java`
Mở `src/main/java/Main.java` và thêm đoạn code:
```java
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String str = "  Hello Gradle!  ";
        System.out.println("Trimmed: " + StringUtils.trim(str));
    }
}
```

### 4. Chạy chương trình
```sh
gradle run
```
