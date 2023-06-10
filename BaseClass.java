����   1 I  Flipcart1/BaseClass  java/lang/Object driver Lorg/openqa/selenium/WebDriver; <init> ()V Code
     LineNumberTable LocalVariableTable this LFlipcart1/BaseClass; setUp RuntimeVisibleAnnotations #Lorg/testng/annotations/BeforeTest;  !http://192.168.204.94:4444/wd/hub  chrome  java/net/URL
     (Ljava/lang/String;)V
    java/net/MalformedURLException    printStackTrace " .org/openqa/selenium/remote/DesiredCapabilities
 ! 
 ! % &  setBrowserName ( (org/openqa/selenium/chrome/ChromeOptions
 ' 
 ' + , - merge N(Lorg/openqa/selenium/Capabilities;)Lorg/openqa/selenium/chrome/ChromeOptions; / *org/openqa/selenium/remote/RemoteWebDriver
 . 1  2 3(Ljava/net/URL;Lorg/openqa/selenium/Capabilities;)V	  4   gridUrlString Ljava/lang/String; browserName gridUrl Ljava/net/URL; e  Ljava/net/MalformedURLException; capabilities 0Lorg/openqa/selenium/remote/DesiredCapabilities; options *Lorg/openqa/selenium/chrome/ChromeOptions; tearDown "Lorg/testng/annotations/AfterTest; C E D org/openqa/selenium/WebDriver F  quit 
SourceFile BaseClass.java !                	   3     *� 
�       
                               	   �     JLMN� Y+� N� 
:� � !Y� #:,� $� 'Y� ):� *W*� .Y-� 0� 3�          2                " $ # * $ 3 % ; ' I (    H    J      G 5 6   D 7 6   B 8 9    : ;  $ & < =  3  > ?   @        A   	   8     
*� 3� B �       
    - 	 .        
      G    H