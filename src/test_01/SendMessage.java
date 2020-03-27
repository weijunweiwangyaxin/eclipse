package test_01;

public class SendMessage {

	/**
	 * Sender���send(String)�����ܹ������ŷ������������󣬶��ŷ������Ὣ��Ӧ������Ϊ���ŷ��ͳ�ȥ��
	 * ���Ƕ��ŷ�����Ϊ���ⷢ���������Ų�ȡ��������ʩ��Ҫ��1�����ڶ�send(String)�����ĵ��ò��ܳ���20�Ρ�
	 * ��˶���ModifiedSender�࣬������send(String)������������ŷ�������Ҫ��
	 * main������ģ���˿ͻ�������Ϣ�ĳ�����ÿ������һ��0-5������ʱ�䲢����ModifiedSender��send(String)������
	 * ���ModifiedSender���б�Ҫ���޸ģ���������ŷ�������Ҫ��
	 * ����ο�����30��
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
			System.out.println("������Ϣ" + message);
		}
	}

