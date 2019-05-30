# java oracle 연동

![1559194029433](C:\Users\student\AppData\Roaming\Typora\typora-user-images\1559194029433.png)



![1559194059329](C:\Users\student\AppData\Roaming\Typora\typora-user-images\1559194059329.png)

oracle library 도 연동해서 쓰겠다는 뜻...

``` java
package db1;

public class Select {

	public static void main(String[] args) {
		// 1. JDBC Driver Loading..
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

```

oracle 에 접속하겠다는 뜻