# Nuance Mobile SDK

- [Nuance Languages & Voices | Languages](http://developer.nuance.com//public/index.php?task=supportedLanguages)
- [HTTP Services 1.0 Programmer’s
Guide _PDF_ (API)](http://developer.nuance.com/public/Help/HttpInterface/HTTP_web_services_for_NCS_clients_1.0_programmer_s_guide.pdf)
- [Documentation](http://kolipass.github.io/nuance-speachkit-android/)
 - [javadoc](http://kolipass.github.io/nuance-speachkit-android/javadoc/index.html)
 
Usage
====================
 * Normal usage (not work in current moment)
 
Add it to your root build.gradle with:
```gradle
repositories {
    maven { url "https://jitpack.io" }
}
```
and:

```gradle
dependencies {
	compile 'com.github.kolipass:nuance-speachkit-android:1.4.12'
}
```

or

```gradle
dependencies {
	compile 'com.github.kolipass:nuance-speachkit-android:-SNAPSHOT'
}
```

* Sub project dependency

In your project root folder:

```
$ git submodule add https://github.com/kolipass/nuance-speachkit-android speachkit
$ git submodule init
$ git submodule update
$ echo "include ':speachkit:library'" >  settings.gradle
```

* Local usage (prefer in current moment)

If you want to use you own local fork:
You need run ```    gradle install ```and check the local Maven repo folder ```.m2/repository/speachkit/library/```

Add it to your root build.gradle with:
```gradle
repositories {
        mavenLocal()
}
```
and:

```gradle
dependencies {
     compile 'speachkit:library:unspecified'
}
```

[![Release](https://img.shields.io/github/release/kolipass/nuance-speachkit-android.svg?label=maven)](https://jitpack.io/#kolipass/nuance-speachkit-android)
