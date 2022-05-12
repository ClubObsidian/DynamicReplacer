# DynamicReplacer

[![](https://jitpack.io/v/ClubObsidian/DynamicReplacer.svg)](https://jitpack.io/#ClubObsidian/DynamicReplacer)

An intermediary for hooking into replacer plugins. Allows you to hook into DynamicReplacer and then have DynamicReplacer register your replacers in any of the replacer plugins that it hooks into.

## Dependency

Gradle
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    com.github.clubobsidian.dynamicreplacer:common:1.0.0
}
```

Maven
```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>

<dependency>
	<groupId>com.github.clubobsidian.dynamicreplacer</groupId>
	<artifactId>common</artifactId>
	<version>1.0.0</version>
</dependency>
```