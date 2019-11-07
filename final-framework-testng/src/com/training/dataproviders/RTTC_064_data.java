package com.training.dataproviders;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;

import java.util.List;

import org.testng.annotations.DataProvider;

public class RTTC_064_data {

	@DataProvider(name = "excel-inputs")
	public static Object[][] getExcelData(){
		String fileName ="C:\\Users\\DeepakNallu\\Desktop\\Selenium\\RTTC064_data.xlsx"; 
		return new ApachePOIExcelRead().getExcelContent(fileName); 
	}
	
}
