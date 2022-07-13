package javaTest.a;

import javaTest.a.util.StringUtil;

import java.io.File;
import java.io.IOException;


public class StringDemo {
	public static void main(String[] args) {
		
		//字段
		String ziduan1="id,thread_code,web_trade_date,trade_time,organ_code,organ_name,oper_dept,oper_code,oper_name,module_name,module_code,trade_consuming_time,running_method,request_ip,running_result,service_code,last_mod_stamp,argu,";
		
		
		//表名
		String table1="web_log_info";
		
		
		
		
		
		
		
		
		
		
		StringUtil stringUtil = new StringUtil();
		StringBuffer stringBuffer = new StringBuffer();
		StringBuffer stringBuffer1 = new StringBuffer();
		
		
		String ziduan2 = stringUtil.SubString(ziduan1, 0, ziduan1.length()-1);
		String ziduan = stringUtil.Replace(ziduan2, ",", "||''|+|''||");
		String table = stringUtil.ToUpperCase(table1);;
		
		String where = "";
		String type ="";
		if (type.equals(where)) {
			type="I";
		}else {
			type="A";
		}
		
		stringBuffer.append("select ").append(ziduan).append("||''|-|'' from").append(" ").append(table).append(where);
		
		
		String s[]=stringUtil.Split(ziduan2, ",");
		stringBuffer1.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>|<DATAFILE>|<DATAHEAD>|<DATA_NAME>99710970001_TRADB-").append(table).append("</DATA_NAME>|<DATA_TYPE>").append(type);
		stringBuffer1.append("</DATA_TYPE>|<ROW_NUM>$rowNum</ROW_NUM>|<PAGE_NUM>$pageNum</PAGE_NUM>|<FIELD_NUM>").append(s.length).append("</FIELD_NUM>|<FIELDS>|");
		for(int i=0;i<s.length;i++) {
			stringBuffer1.append("<FIELD ID=\"").append(i+1).append("\">").append(s[i]).append("</FIELD>|"); 
		}
		stringBuffer1.append("</FIELDS>|</DATAHEAD>|<DATABODY>|<PAGE PAGENO =''1'' RECORDNUM=''$recordNum''>");
		StringBuffer sql = new StringBuffer();
		sql.append("\r\n").append("INSERT INTO pm_file_gen_para(sub_task_code, sub_task_name, task_code, task_name, data_name, sql_text, script_para, han_type, db_name, file_head, file_tail, task_desc, split_num, compress_flag, file_type, file_head_valid_info, db_tab_type) VALUES ('SEND_CHK2A15','测试任务','SEND','文件发送','").append(table).append("','");
		sql.append(stringBuffer).append("', 'WITH (ENCODING ''utf8'')','");
		sql.append(type).append("', 'batch','");
		sql.append(stringBuffer1).append("', '|</PAGE>|</DATABODY>|</DATAFILE>', '测试','1', '01', '01',NULL,'S');");
		File f = new File("d:"+File.separator+"IOTest");
		f.mkdir();
		String path = "d:"+File.separator+"IOTest"+File.separator+"test1.txt";
		File f1 = new File(path);
		if(f1.exists()) {
			f1.delete();
		}else {
			try {
				f1.createNewFile();
				System.out.println("创建test1文件成功");
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		String string2 = "d:"+File.separator+"IOTest"+File.separator+"test1.txt";
		try {
			stringUtil.OutputStreamNext(string2,sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sql);
	}
}
