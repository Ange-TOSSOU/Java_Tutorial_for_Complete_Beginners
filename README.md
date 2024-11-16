# Java Tutorial for Complete Beginners, *by John Purcell*

## Section 1 : Introduction
- **Chapter 1** : Introduction and installation
- **Chapter 2** : What Java is and how it works ?
- **Chapter 3** : Getting a job and what to study after completing ?
- **Chapter 4** : How to get The most out of this course    

## Section 2 : Programming Core Java
- **Chapter 5** : [A Hello World program][chapter_5_programs]
- **Chapter 6** : [Using variables][chapter_6_programs]

## Section 3 : The Java Collections Framework
## Section 5 : What's New In Java 8 ?

[chapter_5_programs]: https://github.com/Ange-TOSSOU/Java_Tutorial_for_Complete_Beginners/tree/main/Chapter_5
[chapter_6_programs]: https://github.com/Ange-TOSSOU/Java_Tutorial_for_Complete_Beginners/tree/main/Chapter_6

## Additional notes
These notes are based on the [Oracle Java SE Tutorial][oracle_java_se_tutorial].
### About chapter 6
- Java defines the following kinds of variables:
  - `Instance variables`
  - `Class variables`
  - `Local variables`
  - `Parameters`
- Uses the Camel Case convention for naming Java variables except for the ones storing constant value, where we use Screaming Snake Case convention.
- Java supports eight (08) primitive data types :
  - `byte` : an 8-bit signed two's complement integer
  - `short` : an 16-bit signed two's complement integer
  - `int` : an 32-bit signed two's complement integer
  - `long` : an 64-bit signed two's complement integer
  - `float` : a single-precision 32-bit IEEE 754 floating point; **should never be used for precise values, such as currency**
  - `double` : a single-precision 64-bit IEEE 754 floating point; generally the default choice for decimal values; **should never be used for precise values, such as currency**
  - `boolean` : has only two possible values : *true* and *false*
  - `char` : a single 16-bit Unicode character
- Special escape sequences for `char` are:
  - `\b` (backspace)
  - `\t` (tab)
  - `\n` (line feed)
  - `\f` (form feed)
  - `\r` (carriage return)
  - `\"` (double quote)
  - `\'` (single quote)
  - `\\` (backslash)

[oracle_java_se_tutorial]: https://docs.oracle.com/javase/tutorial/

[comment]: # (String objects are immutable, which means that once created, their values cannot be changed.)