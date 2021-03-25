package by.epam.skillup.Classes.SimplestClasses;

public class Counter {
	public static void main(String[] args) {
		Counter counter = new Counter(7, 5, 10);
		System.out.println("��������� ����� - " + counter.getCurrentValue());
		System.out.print("���������� �� �������: ");
		System.out.println(counter.increase());

		System.out.print("���������� �� �������: ");
		System.out.println(counter.decrease());
	}

	private int currentValue;
	private int minValue;
	private int maxValue;

	public Counter(int currentValue, int minValue, int maxValue) {
		this.currentValue = currentValue;
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	public String increase() {
		String result = "";
		if (getCurrentValue() < minValue) {
			result = "��������� ����� ������ ������ ���������";
			return result;
		}
		setCurrentValue(getCurrentValue() + 1);

		if (getCurrentValue() == maxValue) {
			result = "��� ���������� ���������� ������� ���������" + maxValue;
		} else if (getCurrentValue() > maxValue) {
			result = "����� �� ������� ��������� " + maxValue + " ��� ���������� �����";
		}

		return result + getCurrentValue();
	}

	public String decrease() {
		String result = "";
		if (getCurrentValue() > maxValue) {
			result = "��������� ����� ������ ������ ���������";
			return result;
		}
		setCurrentValue(getCurrentValue() - 1);
		if (getCurrentValue() == minValue) {
			result = "��� ���������� ���������� ������� ���������" + minValue;
		} else if (getCurrentValue() < minValue) {
			result = "����� �� ������� ��������� " + minValue + " ��� ���������� �����";
		}

		return result + getCurrentValue();
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}
}
