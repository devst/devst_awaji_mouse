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
		assertEquals("�s���ӎO�p�`", target.getName(2, 3, 4));
	}

	/**
	 * �O�p�`�ɂȂ�Ȃ��ꍇ: �����ꂩ�̕ӂ�0
	 */
	@Test(expected = IllegalArgumentException.class)
	public void ��O�p�`_value0(){
		target.getName(0, 1, 1);
	}

	/**
	 * �O�p�`�ɂȂ�Ȃ��ꍇ: �O�p�s�������������Ȃ�����
	 */
	@Test(expected = IllegalArgumentException.class)
	public void ��O�p�`_�O�p�s����(){
		target.getName(1, 1, 10);
	}

	/**
	 * �O�p�`�ɂȂ�Ȃ��ꍇ: �����ꂩ�̕ӂ�0
	 */
	@Test(expected = IllegalArgumentException.class)
	public void ��O�p�`_�����ꂩ�̕ӂ�0(){
		target.getName(0, 0, 0);
	}

	/**
	 * �s���ӎO�p�`:���ׂĂ̕ӂ��Ⴄ����
	 * �O�p�`�ɂȂ�Ȃ��ꍇ: �����ꂩ�̕ӂ��}�C�i�X�l
	 */
	@Test(expected = IllegalArgumentException.class)
	public void ��O�p�`_�����ꂩ�̕ӂ��}�C�i�X�l(){
		target.getName(-1, 1, 1);
	}

}
