package com.eomcs.web.javascript;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex00Controller {

  @RequestMapping("/javascript/ex00/exam06")
  public String exam06() {
    return "<ul><li>ȫ�浿</li><li>�Ӳ���</li><li>������</li></ul>"; // UI������ ����� ������. //�̰� �ٷ� ���������� ���
  }
  @RequestMapping("/javascript/ex00/exam07")
  public Object exam07() {
    String[] names = {"ȫ�浿", "�Ӳ���", "������"};
    return names; // Ŭ���̾�Ʈ ������ ���� UI�� �ƴ϶� �������̴� //�̰� REST API����̴�.
  }
}