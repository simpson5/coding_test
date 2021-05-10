import java.util.ArrayList;
import java.util.Arrays;

//���� ������ ���ں� ���� = ���� ���� ���� ������ ���ں� ���� + (�� ��°�� ���� ���� ������ ���ں� ���� * 2)
public class Solution {

	public int solution(int[] scoville, int K) {
		int answer = 0;

		ArrayList<Integer> heap;
		heap = new ArrayList<>();
		heap.add(0); // heap �� �ε����� �˱� ���� 0���� �����Ѵٴ� Ư���� ������.

		// heap ���� Ʈ�� ����
		for (int s : scoville) {
			insert(heap, s);
		}

		if (scoville[0] == 0 && scoville[1] == 0) {
			return -1;
		}

		while (true) {
			System.out.println(heap.get(1));
			//���̻� ������ �� ������
			if (heap.size() == 2 && heap.get(1) < K) {
				return -1;
			}

			if (heap.get(1) >= K) {
				return answer;
			}

			int x = heap.get(1);
			delete(heap);
			int y = heap.get(1);
			delete(heap);
			int k = x + y * 2;
			insert(heap, k);
			answer++;
			System.out.println(answer + " : " + heap);
		}
	}

	// insertion
	private void insert(ArrayList<Integer> heap, int data) {
		heap.add(data);
		int position = heap.size() - 1;
		// ��Ʈ ������ �̵��߰ų�, �θ� Heap�� �ڽ� Heap���� ���� �� ����
		while (position > 1 && heap.get(position / 2) > heap.get(position)) {

			/* �θ� ���� �ڽ� ��尣�� swap�� ���� ���� */
			int temp = heap.get(position / 2);
			heap.set(position / 2, heap.get(position));
			heap.set(position, temp);

			position /= 2;
		}
	}

	int delete(ArrayList<Integer> heap) {
		// heap ����� 1���� ������ ��, ���� ���� ������ return 0;
		if (heap.size() - 1 < 1) {
			return 0;
		}

		int deleteData = heap.get(1); // ��� ��� ����

		heap.set(1, heap.get(heap.size() - 1)); // ��Ʈ ����� �ڸ��� ���� ����� data�� ����
		heap.remove(heap.size() - 1); // ���� ��� ����

		int position = 1;
		while ((position * 2) < heap.size()) { // ���� ũ�⺸�� ���� �� ����
			int min = heap.get(position * 2); // ���� ����� ���� �ڽ� ����� ��
			int minPos = position * 2; // ���� ����� ���� �ڽ� ����� �ε���

			// ������ �ڽ� ���� ���� �ڽ� ��� �� �� ū ��忡 ���� ���ϰ� ��ȯ�ϱ� ������ ���� �ڽĳ��� ������ �ڽ� ����� ���� ���ϴ�
			// ������ ��ģ��.
			if (((position * 2 + 1) < heap.size()) && min > heap.get(position * 2 + 1)) { // ������ �ڽ� ��尡 �� ũ�� �ٲ�����Ѵ�.
				min = heap.get(position * 2 + 1); // ������ �ڽ� ���� ����
				minPos = position * 2 + 1; // ��ġ ���� ������ �ڽ� ���� ����
			}

			if (heap.get(position) < min)
				break; // ���� ��庸�� �ڽ� ����� ���� �� ũ��, ���� ������ �����ϸ� �ݺ� ����

			/* �ڽİ� �θ��� SWAP ���� */
			int temp = heap.get(position);
			heap.set(position, heap.get(minPos));
			heap.set(minPos, temp);
			position = minPos;
		}
		return deleteData;
	}
}
