package testDemo;

import redis.clients.jedis.Jedis;

public class test {
	
	//111111111111111111111222222
  public static void main(String[] args) {
      //连接本地的 Redis 服务  sdfsfsasfsa
      Jedis jedis = new Jedis("localhost");/////-------------123111188892779
      ///alsjdfla
      System.out.println("连接成功");
      //设置 redis 字符串数据
      jedis.set("runoobkey", "www.runoob.com112");
      // 获取存储的数据并输出  asfdasfsa
      System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkey"));
  }
  
}
