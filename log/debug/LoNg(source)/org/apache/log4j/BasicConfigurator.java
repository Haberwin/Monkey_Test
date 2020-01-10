/*    */ package org.apache.log4j;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BasicConfigurator
/*    */ {
/*    */   public static void configure()
/*    */   {
/* 46 */     Logger root = Logger.getRootLogger();
/* 47 */     root.addAppender(new ConsoleAppender(new PatternLayout("%r [%t] %p %c %x - %m%n")));
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void configure(Appender appender)
/*    */   {
/* 58 */     Logger root = Logger.getRootLogger();
/* 59 */     root.addAppender(appender);
/*    */   }
/*    */   
/*    */   public static void resetConfiguration() {}
/*    */ }


/* Location:              /home/liuwenhua/tools/LoNg(Official)_ALPS/LoNg_v2.1710.5 (2)/LoNg.jar!/org/apache/log4j/BasicConfigurator.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */