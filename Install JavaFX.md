<br>How to install JavaFX ?

Starting from Java 11, JavaFX was removed from the JDK and is now available as a separate module called "OpenJFX." To use JavaFX with Java 17, you'll need to download and set up OpenJFX separately.
Here are the steps to install JavaFX for Java 17:

<br>1.Download Java 17 (JDK): First, download and install the Java 17 JDK from the official Oracle website or any other trusted source.
<br>2.Download OpenJFX: Visit the OpenJFX website (https://openjfx.io/) and download the version of OpenJFX that matches your Java 17 JDK installation.
Ensure that you download the correct version for your operating system.
<br>3.Extract OpenJFX: Once the OpenJFX download is complete, extract the contents of the downloaded archive to a directory of your choice.
<br>4.Set Up Environment Variable (Optional): To make it easier to work with JavaFX, you can set up an environment variable named PATH_TO_FX that points to the extracted OpenJFX directory. This step is optional but can be helpful if you plan to use JavaFX in multiple projects. Note that the process for setting environment variables varies based on your operating system.
<br>5.Add OpenJFX to Module Path (Command Line): When compiling and running JavaFX applications from the command line, you need to include the OpenJFX modules explicitly. 
Use the --module-path option to specify the path to the OpenJFX directory and the --add-modules option to add the required JavaFX modules. For example:

#javac
--module-path /path/to/openjfx --add-modules javafx.controls,javafx.fxml YourJavaFXApp.java
#java
--module-path /path/to/openjfx --add-modules javafx.controls,javafx.fxml YourJavaFXApp

<br>6Replace /path/to/openjfx with the actual path to the extracted OpenJFX directory.
<br>7Set Up JavaFX in IDE (IntelliJ IDEA): If you're using an Integrated Development Environment (IDE) like IntelliJ IDEA, you can configure the JavaFX SDK in the IDE settings. In IntelliJ IDEA, go to File -> Project Structure -> SDKs, and add the OpenJFX directory as an additional SDK.
Then, go to the Modules section and add the required JavaFX modules as dependencies for your project.
