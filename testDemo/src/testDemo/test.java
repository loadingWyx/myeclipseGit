package testDemo;

import redis.clients.jedis.Jedis;

public class test {
	
  public static void main(String[] args) {
      //���ӱ��ص� Redis ����  sdfsfsasfsa
      Jedis jedis = new Jedis("localhost");
      ///alsjdfla
      System.out.println("���ӳɹ�");
      //���� redis �ַ�������
      jedis.set("runoobkey", "www.runoob.com");
      // ��ȡ�洢�����ݲ����  asfdasfsa
      System.out.println("redis �洢���ַ���Ϊ: "+ jedis.get("runoobkey"));
  }
  
}
