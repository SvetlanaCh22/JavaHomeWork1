// Encoding cp1251 because my Windows console show ??? for russian chars

// ������� ��� ������� ����� �� 1 �� 1000

// �������� ��������

public class main {
    public static void main(String[] args) {
        System.out.println("������� ����� �� 0 �� 1000:  ");
        int n = 0; // ��� �������, ����� ������ 10 ����� ������ ������� ������
        // �������� � 2, ��� ��� ������� �� �������� �� �������, �� ��������� ������
        for(int i = 2; i < 1000; ++i){
            // ��������� ������� �� ��� ������� �� ������ �����
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
                if(i%j==0){
                    ++count;
                }
            }
            // ������ 10 ����� ������ ������� ������ (��� ������� ������)
            if(n==10) {
                System.out.print("\n");
                n = 0;
            }
            // ���� ����� ������� - ������� � �������� Tab
            if(count<2) {
                System.out.print(i + "\t");
                n++;
            }
        }
    }
}
