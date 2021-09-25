package com.java.learn.sub.exercise.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author Administrator
 * Exam ��  ������
 * ���ԣ�����ѧ��  һ�ſ���
 * ��ʾ��ѧ������HashMap���
 * 
 * ���⣺ΪExam�����һ������������Ϊ����ѧ���о�����ӡ�ɼ�����(���Ρ�����)
 */
public class Exam {
	private Set<Student> set = new HashSet<Student>();
	private Paper pp = new Paper();

	// ��ӡѧ�����Գɼ�������׼����treeset
	private TreeSet<Student> tSet = new TreeSet<Student>(
			new StudentComparator());


	public Set<Student> getSet() {
		return set;
	}

	public void setSet(Set<Student> set) {
		this.set = set;
	}

	public Paper getPp() {
		return pp;
	}

	public void setPp(Paper pp) {
		this.pp = pp;
	}

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(Set<Student> set, Paper pp) {
		super();
		this.set = set;
		this.pp = pp;
	}

	// �о�
	public void judge() {
		// ȡ���Ծ��д����Ŀ��map����
		Map<String, Question> map1 = pp.gethMap();

		// ���������е�set���ϣ�ȡ��ÿ��ѧ����Ϊÿ��ѧ���о�
		for (Student s : set) {
			int sumScore = 0;//ѧ���ɼ�
			// ȡ��ѧ�����
			AnswerSheet as = s.getAw();
			// ȡ������д�ŵĴ�������map���ϣ�key����� value�Ǵ�
			Map<String, String> map2 = as.gethMap();

			// Ϊ�˱���ѧ�����еĴ���������ȡ����������ŵ�set����
			Set<String> set1 = map2.keySet();
			Iterator<String> it1 = set1.iterator();
			while (it1.hasNext()) {
				
				
				// ѧ���ش���������
				String qNo = it1.next();

				// ȡ��ѧ������ŵĴ�
				String qAnswer = map2.get(qNo);

				// ���Ծ���ȡ������Ŷ�Ӧ��question
				Question question = map1.get(qNo);

				// ȡ������Ŀ������ȷ��
				String correct = question.getCorrectAnswer();

				if (correct.equalsIgnoreCase(qAnswer)) {
					sumScore += question.getScore();
				}
			}

			// ����ѧ���Ŀ��Գɼ�
			s.setScores(sumScore);
			// Ϊ��ͳ��ѧ�����������к÷ֵ�ѧ����ӵ�treeset������
			tSet.add(s);
		}
	}

	// ��ӡ��������
	public void printScore() {
		int mingCi = 1;

		for (Student s : tSet) {
			System.out.println("��" + mingCi + "��: " + s.toString());
			mingCi++;
		}
	}

}
