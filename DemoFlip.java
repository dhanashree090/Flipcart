����   1 N  Flipcart1/DemoFlip  java/lang/Object driver Lorg/openqa/selenium/WebDriver; 
closepopup  Lorg/openqa/selenium/WebElement; RuntimeVisibleAnnotations $Lorg/openqa/selenium/support/FindBy; xpath //button[text()='✕'] mobile (//img[@class="_396cs4"])[2] samsung //div[text()='SAMSUNG'] apple //div[text()='APPLE'] realme //div[text()='realme'] 	removeapp //div[@class="_3ztiZO"][1] 	removesam 
removereal <init> "(Lorg/openqa/selenium/WebDriver;)V Code
     ()V	     
 " $ # 'org/openqa/selenium/support/PageFactory % & initElements 8(Lorg/openqa/selenium/SearchContext;Ljava/lang/Object;)V LineNumberTable LocalVariableTable this LFlipcart1/DemoFlip; flipkart 
Exceptions . java/lang/InterruptedException	  0   2 4 3 org/openqa/selenium/WebElement 5  click	  7  	  9        �
 = ? > java/lang/Thread @ A sleep (J)V	  C  	  E  	  G  	  I  	  K   
SourceFile DemoFlip.java !     	            	     
  s       	     
  s       	     
  s       	     
  s       	     
  s       	     
  s       	     
  s       	     
  s          O     *� *+� +*� !�    '          	    (        ) *          +   ,     -    �     a*� /� 1 *� 6� 1 *� 8� 1  :� <*� B� 1  :� <*� D� 1 *� F� 1  :� <*� H� 1  :� <*� J� 1 �    '   6    + 	 ,  -  . ! / * 0 0 1 9 2 B 3 H 4 Q 5 W 6 ` ; (       a ) *    L    M