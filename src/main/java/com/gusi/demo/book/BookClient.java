package com.gusi.demo.book;

import com.ice.demo.book.Message;
import com.ice.demo.book.OfflineBookPrx;
import com.ice.demo.book.OfflineBookPrxHelper;
import com.ice.demo.book.OnlineBookPrx;
import com.ice.demo.book.OnlineBookPrxHelper;
import com.ice.demo.hello.HelloServicePrx;
import com.ice.demo.hello.HelloServicePrxHelper;

/**
 * Created by yydeng on 2017/12/8.
 */
public class BookClient {
	public static void main(String[] args) {
		int status = 0;
		Ice.Communicator communicator = null;
		try {
			// 获取communicator通信器
			communicator = Ice.Util.initialize(args);
			// 构造一个Proxy对象，通过传入远程服务单元的名称、网络协议、Ip和端口
			// Ice.ObjectPrx base =
			// communicator.stringToProxy("OnlineBookServer:default -p 10001");
			Ice.ObjectPrx base = communicator.stringToProxy("OfflineBookServer:default -p 10002");

			// OnlineBookPrx prxy = OnlineBookPrxHelper.checkedCast(base);
			OfflineBookPrx prxy = OfflineBookPrxHelper.checkedCast(base);
			if (prxy == null) {
				throw new NullPointerException("prxy is null!");
			}

			Message msg = new Message();
			msg.name = "gusi";
			msg.type = 1;
			msg.price = 99.9;
			msg.valid = true;
			msg.content = "this is a good book!";

			boolean[] result = prxy.bookTrance(new Message[] { msg });
			// Message result = prxy.bookTick(msg);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			communicator.destroy();
			System.exit(status);
		}
	}
}
