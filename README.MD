# Gradle Multi-Project Build with Libraries

### Build Locally

```
./gradlew publishToMavenLocal && ./gradlew jar
```

`publishToMavenLocal` task builds and publishes artifacts for :infrastructure:string-utils module.

Output (maven artifacts and metadata):

1. production jar
1. source jar
1. javadoc jar
1. pom file 
1. checksum files

Target Repository:

Local Maven cache (<user.home>/.m2/repository)

`jar` task will build `:random-test-generator` module and load `string-utils` dependency from maven repo


