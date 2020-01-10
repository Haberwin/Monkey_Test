/*    */ package org.apache.log4j.lf5.viewer;
/*    */ 
/*    */ import javax.swing.table.DefaultTableModel;
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
/*    */ public class LogTableModel
/*    */   extends DefaultTableModel
/*    */ {
/*    */   private static final long serialVersionUID = 3593300685868700894L;
/*    */   
/*    */   public LogTableModel(Object[] colNames, int numRows)
/*    */   {
/* 49 */     super(colNames, numRows);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean isCellEditable(int row, int column)
/*    */   {
/* 57 */     return false;
/*    */   }
/*    */ }


/* Location:              /home/liuwenhua/tools/LoNg(Official)_ALPS/LoNg_v2.1710.5 (2)/LoNg.jar!/org/apache/log4j/lf5/viewer/LogTableModel.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */