Kotlin implementation of https://developer.squareup.com/blog/chasing-swallowed-exceptions/


Usage:


1. Download the compiled jar from the releases page, or compile yourself with `./gradlew agent:jar`
1. Move the jar to a directory in your project.
1. Add the following to your root `build.gradle[.kts]`.

    ```
    # Kotlin
    subprojects {
        afterEvaluate {
            tasks.withType<Test>().configureEach {
                doFirst {
                    jvmArgs = listOf("-javaagent:${rootProject.rootDir}/PATH_TO_JAR/rethrowing-rxjava-agent-VERSION.jar") + (jvmArgs ?: listOf<String?>())
                }
            }
        }
    }

    # Groovy
    subprojects {
     afterEvaluate { Project subproject ->
       subproject.tasks.withType(Test) {
         doFirst {
           jvmArgs += "-javaagent:${rootProject.rootDir}/PATH_TO_JAR/rethrowing-rxjava-agent-VERSION.jar"
         }
       }
     }
    }
    ```
