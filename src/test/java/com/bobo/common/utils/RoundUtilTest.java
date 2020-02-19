package com.bobo.common.utils;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

import org.junit.Test;

public class RoundUtilTest {
	@Test
	public void testGetRoundTest() throws IOException {
		//目标坐标
		double j=116;//经度
		double w=39;//维度
		//读入数据
		List<String> read = StreamUtil.read(this.getClass().getResourceAsStream("/data.txt"));
		for (String str : read) {
			String[] s = str.split(",");
			double d = DistanceUtil.getDistance(j,w,Double.parseDouble(s[2]), Double.parseDouble(s[3]));
			 //保留两位小数
			DecimalFormat df = new DecimalFormat("#.00");
			if (d>=0 && d<=15) {
				System.out.println("2环");
			}else if (d>=16 && d<=30) {
				System.out.println("3环");
			}else if (d>=31 && d<=40) {
				System.out.println("4环");
			}else if (d>=41 && d<=60) {
				System.out.println("5环");
			}else if (d>=61 && d<=70) {
				System.out.println("6环");
			}
			System.out.println("目标距离为"+df.format(d)+"米");
		}
		
	}
}
