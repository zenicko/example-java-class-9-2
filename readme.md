#I'm a readme file and I'll tell you about the project.
This project is an example to show how the automation testing junior can use the class.
___
Steps of the project.

Step 1. Create the files: .gitignore, build.gradle and readme.md

Step 2. Create the structure of directories: src/main/java/ru/zenicko/

Step 3. Create the files of the project: StartMain.java, Cat.java.

Step 4. Create the classes : StartMain and Cat.

Step 5. Push the program to [my git-repo](https://github.com/zenicko/example-java-class-9-2.git)
___
What's new?

###1. Java
   1. Import class from a file to main package.

       **import [the name of a package].[the name of a class];**
   2. Create the type of enum

       **enum Gender {male, female, undefine};**
  
       **Gender gender;**
    
       **gender = Gender.undefine;**
###2. Gradle
   1. Language localisation

       ***test {***

       ***system.Property "chromeoptions.pref","intl.accept_languages=ru"***

       ***}***

   2. Encoding

      ***compileTestJava {***

      ***options.encoding = 'UTF-8'***

      ***}***
###3. Resources
   1. [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html "Google Java Style Guide")


___
###Checking: 

1. Fixed bugs 06.11.2021
   1. Correct the value of enum "undefine". **Done "undefined".**
   2. Correct the name of the method of the class Cat "WhoIsCat". **Done "whoIsCat".**
   3. Correct the name of the method of the class Cat "childbirth". **Done "birthOfKitty".**
2. Fixed wrong code style
    1. Method names are typically verbs or verb phrases. For example, sendMessage or stop. [*5.2.3 Method names*](https://google.github.io/styleguide/javaguide.html#s5.2.3-method-names)
   
       1. **whoIsCat -> printInfoAboutCat**
       
       2. **birthOfKitty -> createChildCat**
       
3. Fixed bugs in the method createChildCat
