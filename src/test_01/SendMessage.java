package test_01;

public class SendMessage {

	/**
	 * Sender类的send(String)方法能够给短信服务器发送请求，短信服务器会将相应参数作为短信发送出去。
	 * 但是短信服务器为避免发送垃圾短信采取了限流措施，要求1分钟内对send(String)方法的调用不能超过20次。
	 * 因此定义ModifiedSender类，并定义send(String)方法以满足短信服务器的要求。
	 * main方法中模拟了客户发送信息的场景，每次生成一个0-5秒的随机时间并调用ModifiedSender的send(String)方法，
	 * 请对ModifiedSender进行必要的修改，以满足短信服务器的要求。
	 * 本题参考分数30分
	 */
	
		public static void main(String[] args)  {
			new Thread(() -> {
				while (true) {
					int sleepTime = (int) (Math.random() * 5000);
					try {
						Thread.sleep(sleepTime);
					} catch (InterruptedException e) {
						continue;
					}
					ModifiedSender.send("message" + sleepTime);
					
				}
			}).start();
		}
	}

	class ModifiedSender {
		public static void send(String message) {
			Sender.send(message);
		}
	}


	class Sender {
		public static void send(String message) {
			System.out.println("发送信息" + message);
		}
	}

