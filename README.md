# uml-generator-CSSE374
CSSE374 Term Project - Winter 2018-2019

My partner was Hussein Alawami

## How to use

Pass in any full classnames to args(ex: java.lang.String, not just String)
Pass in any number of the options below to args:
1. "-recursive" makes sure superclasses and interfaces of passed in classes are parsed
2. "-private" renders everything
3. "-protected" render only procteded or public classes, fields, and methods
4. "-public" render only public classes, fields, and methods
5. "-file" render to a file
6. "-packages=package1,package2,package3..." limits rendering to the packages specified after =
7. "-list=white-package/class,white-package/class2,black-package/class3,..." whitelists and blacklists certain classes and packages.
8. "-singleton" detects singletons and colors them blue
9. "-removelambdas" removes all lambda methods that may clutter class blocks.
10. "-inheritancecomposition" turns all arrows where inheritance is favored over composition orange
11. "-prerendertasks=fullyqualifiedclassname,fullyqualifiedclassname2,..." Imports and uses the prerendertasks specified
12. "-config" uses the settings file specified in the default configs file of the program ("config.properties")
13. "-config=configsfilename" uses the configs file passed in, if the file doesn't exist, it uses the default configs file
14. "-importdirectories=fullclasspath1,fullclasspath2,..." Adds classpaths to the project classpath at runtime NOTE: fullclasspath must be to the bin directory of a project.
15. "-runfordirectories=fullclasspath1,fullclasspath2,..." Adds any java classes in or beneath the directories to the classes to run on
16. "-adapter" detects the adapter pattern and properly labels it
17. "-decorator" detects the decorator pattern and properly labels it
18. "-dependencyinversionviolation" detects when the dependency inversion principle is violated and properly labels it
19. "-baddecorator" detects when the decorator abstract class doesn't override all methods and adds them in red

The default options are to not recurse into superclasses and interfacess, private level analysis, text display, and using PlantUML
