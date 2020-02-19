package com.bobo.common.utils;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

import org.junit.Test;

public class RoundUtilTest {
	@Test
	public void testGetRoundTest() throws IOException {
		//Ŀ������
		double j=116;//����
		double w=39;//ά��
		//��������
		List<String> read = StreamUtil.read(this.getClass().getResourceAsStream("/data.txt"));
		for (String str : read) {
			String[] s = str.split(",");
			double d = DistanceUtil.getDistance(j,w,Double.parseDouble(s[2]), Double.parseDouble(s[3]));
			 //������λС��
			DecimalFormat df = new DecimalFormat("#.00");
			if (d>=0 && d<=15) {
				System.out.println("2��");
			}else if (d>=16 && d<=30) {
				System.out.println("3��");
			}else if (d>=31 && d<=40) {
				System.out.println("4��");
			}else if (d>=41 && d<=60) {
				System.out.println("5��");
			}else if (d>=61 && d<=70) {
				System.out.println("6��");
			}
			System.out.println("Ŀ�����Ϊ"+df.format(d)+"��");
		}
		
	}
}
