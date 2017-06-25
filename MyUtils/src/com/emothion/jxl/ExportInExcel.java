package com.emothion.jxl;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;  

public class ExportInExcel {

	/** 
     *  
     * 这个是读取模板写入数据 
     * **/  
    private void readWriter(){
        WritableWorkbook wwb=null;  
        WritableSheet wws=null;  
        FileOutputStream out =null;  
        jxl.write.NumberFormat nf = new jxl.write.NumberFormat("#0.00");
        jxl.write.WritableCellFormat wcfN = new jxl.write.WritableCellFormat(nf); // 设置表单格式 
        //获取要读取的EXCEL表格模板  
        File is = new File("d:\\ExcelTemplate.xls");  
        String filename="f:\\";  
        //写入到新的表格里  
        File f=new File(filename,"try1.xls");  
        try {  
            //创建新文件  
            f.createNewFile();  
            out = new FileOutputStream(f);  
            //获取工作簿对象     
            Workbook wb = Workbook.getWorkbook(is);  
            // 创建可写入的工作簿对象
            wwb = Workbook.createWorkbook(out, wb);  
            //根据工作表名获取WritableSheet对象  
            wws=wwb.getSheet("Vote");  
            Label label=null;  
            List<String> list=new ArrayList<String>();
            for (int i = 0; i < 30; i++) {
				list.add(String.valueOf(i+1));
			}
            int count_02=0;  
            for(int i=1;i<=10;i++){  
                for(int j=0;j<3;j++){  
                    //创建label对象设置value值j相当于是X轴I是Y轴位置  
                	label= new Label(2,0,"单元格内容");//插入文本类型
                	jxl.write.Number labelNF = new Number(j,i,Double.valueOf(list.get(count_02)),wcfN);//插入数字类型
                    //添加到工作薄中  
                    wws.addCell(labelNF);  
                    count_02++;  
                }  
            }  
            //将新建立的工作薄写入到磁盘  
            wwb.write();  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally{  
            //关闭流  
            try {  
                wwb.close();  
                out.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
    }  
  
    public static void main(String[] args) {  
        new ExportInExcel().readWriter();  
    } 
}
