class Demo{
	public static void main(String[] args) {
		System.out.println("陈杰万岁!!!换行");

		System.out.print("陈杰万岁");

		// 基本数据类型
		// 4整型 byte（8比特） short（16比特） int(32比特) long（64比特）
		// 2浮点型 float（32比特） double(64比特)
		// 1字符型 char
		// 1布尔型 boolean

		/*
		* 声明在栈内存中
		* 常量值存在常量缓存区中，整数是按32个比特存储，浮点类型是按64比特存储
		*
		* 问题：
		* 1。当声明一个float类型时候，该值范围是32比特，我们常量缓存区中是64比特存储，当赋值给float的时候，float存不下。这个时候需要加上F，降一个级别
		*
		* 2。当声明一个byte（8比特） short（16比特）的时候，我们的常量缓存区中存储的是32比特，也存储不下，为什么此时不报错呢？因为等号会自动将二进制前面的0去掉。
		*
		* 3。当声明一个long（64比特）的时候，我们的常量缓存区中最大的存储范围是32比特，此时存储不下。需要写一个L告诉常量缓存区我没写错，我确实需要这么大的数值。
		* */
	}
}