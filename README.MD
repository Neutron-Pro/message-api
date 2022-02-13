# Message API with the BungeeCord Chat Components. [Minecraft 1.8+]

This api allows to create special messages on Minecraft using the bungeecord-chat library of md_5.

## Implementation of api in your project

**Core**: https://github.com/Neutron-Pro/message-core

**Create your own core**:

```gradle
repositories {
  mavenCentral()
  maven {
    name = 'sonatype'
    url = 'https://oss.sonatype.org/content/groups/public/'
  }
  maven { url "https://jitpack.io" }
}

dependencies {
  compileOnly "net.md-5:bungeecord-chat:1.8-SNAPSHOT"
  implementation 'com.github.Neutron-Pro:message-api:1.0.0'
}
```