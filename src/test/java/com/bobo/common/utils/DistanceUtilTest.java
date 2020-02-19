package com.bobo.common.utils;


import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

import org.junit.Test;

import com.bobo.common.utils.StreamUtil;

public class DistanceUtilTest {

	@Test
	public void testGetDistance() throws IOException {
		//Ŀ������
		double j=116.425249;//����
		double w=39.914504;//ά��
		//��������
		List<String> read = StreamUtil.read(this.getClass().getResourceAsStream("/data.txt"));
		for (String str : read) {
			String[] s = str.split(",");
			double d = DistanceUtil.getDistance(j,w,Double.parseDouble(s[2]), Double.parseDouble(s[3]));
			 //������λС��
			DecimalFormat df = new DecimalFormat("#.00");
			System.out.println("Ŀ�����Ϊ"+df.format(d)+"��");
		}
		
	}


}
