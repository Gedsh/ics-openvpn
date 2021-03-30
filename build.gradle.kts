/*
 * Copyright (c) 2012-2019 Arne Schwabe
 * Distributed under the GNU GPL v2 with additional terms. For full terms see the file doc/LICENSE.txt
 */

val keystorePropertiesFile by extra("/usr/local/KStore/keystore.properties")
val keystoreProperties = java.util.Properties()
keystoreProperties.load(java.io.FileInputStream(keystorePropertiesFile))

val keystoreFile by extra("/usr/local/KStore/pan_alexander.jks")
val keystorePassword by extra(keystoreProperties["storePassword"])
val keystoreAliasPassword by extra(keystoreProperties["keyBPassword"])
val keystoreAlias by extra(keystoreProperties["keyBAlias"])

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(url = "https://jitpack.io")
    }
}
