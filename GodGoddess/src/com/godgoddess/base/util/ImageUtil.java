package com.godgoddess.base.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ImageUtil {
	// 将输入流转换为byte数组
	public static byte[] getImgByte(InputStream is) throws IOException {
		ByteArrayOutputStream bytestream = new ByteArrayOutputStream();
		int b;
		while ((b = is.read()) != -1) {
			bytestream.write(b);
		}
		byte[] bs = bytestream.toByteArray();
			bytestream.close();
		return bs;
	}
}
