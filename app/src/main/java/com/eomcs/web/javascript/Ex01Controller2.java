package com.eomcs.web.javascript;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex01Controller2 {

  @RequestMapping("/javascript/ex01/exam05_1")
  public Object exam05_1() throws Exception {
    Thread.sleep(10000); // 10�ʵ��� ��ٷȴٰ� �۾��� �簳�Ѵ�.
    return "alert('okok')"; // �ڹٽ�ũ��Ʈ �ڵ������� �����Ѵ�. //js�� �ش������ʴ� �Ÿ� �ָ� �� error�䤧��
  }
  @RequestMapping("/javascript/ex01/exam05_2")
  public Object exam05_2() {
    return "console.log('nono')"; // �ڹٽ�ũ��Ʈ �ڵ������� �����Ѵ�.
  }
  @RequestMapping("/javascript/ex01/exam05_x")
  public Object exam05_x() throws Exception {
    Thread.sleep(10000);
    return "50,000"; //�����͸� �����Ѵ�
  }
}