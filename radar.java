public class radar {
    // Phương thức phân tích tín hiệu dựa trên mẫu [2]
    public int[] analyzeDiscreteSignal(int n) {
    int[] result = new int[n + 1];
    for (int i = 0; i <= n; i++) {
    result[i] = calculateSample(i);
    }
    return result;
    }
    
    // Tính giá trị tín hiệu mẫu x(n) theo định nghĩa [2]
    private int calculateSample(int n) {
    if (n >= 0 && n <= 15) {
    return (int) Math.round(1 - (double) n / 15); // Làm tròn để lấy giá trị nguyên
    }
    return 0;
    }
    
    // Phương thức hiển thị kết quả tín hiệu phân tích
    public void displayAnalyzedSignal(int[] signal) {
    System.out.print("Analyzed Discrete Signal: ");
    for (int value : signal) {
    System.out.print(value + " ");
    }
    System.out.println();
    }
    }

