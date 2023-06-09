����   1 �  Flipcart1/FlipcartTestNg  java/lang/Object driver Lorg/openqa/selenium/WebDriver; <init> ()V Code
     LineNumberTable LocalVariableTable this LFlipcart1/FlipcartTestNg; setUp RuntimeVisibleAnnotations #Lorg/testng/annotations/BeforeTest;  java/net/URL  http://192.168.1.5:4444/wd/hub
     (Ljava/lang/String;)V
    java/net/MalformedURLException   printStackTrace   (org/openqa/selenium/chrome/ChromeOptions
   # browserName % chrome
  ' ( ) setCapability '(Ljava/lang/String;Ljava/lang/String;)V + *org/openqa/selenium/remote/RemoteWebDriver
 * -  . 3(Ljava/net/URL;Lorg/openqa/selenium/Capabilities;)V	  0   gridUrl Ljava/net/URL; e  Ljava/net/MalformedURLException; options *Lorg/openqa/selenium/chrome/ChromeOptions; 
testMethod Lorg/testng/annotations/Test; : https://www.flipkart.com/ < > = org/openqa/selenium/WebDriver ?  get A button._2KpZ6l._2doB4z
 C E D org/openqa/selenium/By F G cssSelector ,(Ljava/lang/String;)Lorg/openqa/selenium/By; < I J K findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement; M O N org/openqa/selenium/WebElement P  click R Mobiles
 C T U G linkText      �
 Y [ Z java/lang/Thread \ ] sleep (J)V
 _  ` java/lang/InterruptedException b "//div[contains(@class, '_1p7h2j')]
 C d e G xpath	 g i h java/lang/System j k out Ljava/io/PrintStream; m Checkbox not found
 o q p java/io/PrintStream r  println t java/lang/Exception v *org/openqa/selenium/NoSuchElementException popUpCloseButton  Lorg/openqa/selenium/WebElement; 
mobileMenu  Ljava/lang/InterruptedException; checkBox ,Lorg/openqa/selenium/NoSuchElementException; tearDown "Lorg/testng/annotations/AfterTest; < � �  quit 
SourceFile FlipcartTestNg.java !                	   /     *� 
�                                    	   �     2L� Y� L� M,� � Y� !M,"$� &*� *Y+,� ,� /�          "               $ " 1 #    *    2      0 1 2    3 4    5 6   7        8   	       k*� /9� ; *� /@� B� H L+� L � L*� /Q� S� H L+� L  V� X� M,� ^M*� /a� c� H M,� L � N� fl� n�     # s 9 ? B _ I ^ a u     >    )  -  .   / $ 4 3 5 9 9 ? : C ; G ? I A X B ^ C b D j F    >    k       w x  3 8 y x  C  3 z  I " { x  b  3 |   }        ~   	   8     
*� /�  �       
    K 	 L        
      �    �