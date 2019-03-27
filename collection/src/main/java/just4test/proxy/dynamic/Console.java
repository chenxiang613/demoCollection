package just4test.proxy.dynamic;

import java.lang.reflect.Proxy;

public class Console {

	public static void main(String[] args) {
		//创建被代理类对象
		Printer printer = new Printer();
		//创建handler(增强内容类)
		TransactionHandler handler = new TransactionHandler(printer);
		IPrintable proxy = (IPrintable) Proxy.newProxyInstance(printer.getClass().getClassLoader(), printer.getClass().getInterfaces(), handler);
		proxy.print();
	}

}
