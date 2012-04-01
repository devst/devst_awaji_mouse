package features.mouse;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import features.mouse.Myers;

public class MyersTest {

	Myers target;
	
	@Before
	public void setUp() throws Exception {
		target = new Myers();
	}

	/**
	 * ���O�p�`:���ׂĂ̕ӂ���������
	 */
	@Test
	public void ���O�p�`(){
		assertEquals("���O�p�`", target.getName(1, 1, 1));
	}
	
	/**
	 * �񓙕ӎO�p�`:2�̕ӂ���������
	 */
	@Test
	public void �񓙕ӎO�p�`(){
		assertEquals("�񓙕ӎO�p�`", target.getName(2, 2, 1));
	}
	
	/**
	 * �s���ӎO�p�`:���ׂĂ̕ӂ��Ⴄ����
	 */
	@Test
	public void �s���ӎO�p�`(){
		assertEquals("�s���ӎO�p�`", target.getName(1, 2, 3));
	}

	/**
	 * �s���ӎO�p�`:���ׂĂ̕ӂ��Ⴄ����
	 * �O�p�`�ɂȂ�Ȃ��ꍇ: �����ꂩ�̕ӂ�0
	 */
	@Test(expected = IllegalArgumentException.class)
	public void ��O�p�`_value0(){
		target.getName(0, 1, 1);
	}

	/**
	 * �s���ӎO�p�`:���ׂĂ̕ӂ��Ⴄ����
	 * �O�p�`�ɂȂ�Ȃ��ꍇ: �����ꂩ�̕ӂ��}�C�i�X�l
	 */
	@Test(expected = IllegalArgumentException.class)
	public void ��O�p�`_value_minus(){
		target.getName(-1, 1, 1);
	}

}
