/*    */ package org.apache.log4j.pattern;
/*    */ 
/*    */ import org.apache.log4j.spi.LoggingEvent;
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
/*    */ public final class MessagePatternConverter
/*    */   extends LoggingEventPatternConverter
/*    */ {
/* 32 */   private static final MessagePatternConverter INSTANCE = new MessagePatternConverter();
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   private MessagePatternConverter()
/*    */   {
/* 39 */     super("Message", "message");
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static MessagePatternConverter newInstance(String[] options)
/*    */   {
/* 49 */     return INSTANCE;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void format(LoggingEvent event, StringBuffer toAppendTo)
/*    */   {
/* 56 */     toAppendTo.append(event.getRenderedMessage());
/*    */   }
/*    */ }


/* Location:              /home/liuwenhua/tools/LoNg(Official)_ALPS/LoNg_v2.1710.5 (2)/LoNg.jar!/org/apache/log4j/pattern/MessagePatternConverter.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */