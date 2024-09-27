// Lớp tín hiệu rời rạc
class DiscreteSignal {
    private int[] values; // Lưu trữ các giá trị tín hiệu rời rạc

    // Khởi tạo tín hiệu rời rạc với mảng giá trị
    public DiscreteSignal(int[] values) {
        this.values = values;
    }

    // Tính giá trị tín hiệu x(n) dựa trên định nghĩa [1]
    public int calculate(int n) {
        int sum = 0;
        for (int k = 0; k < values.length; k++) {
            sum += values[k] * delta(n - k);
        }
        return sum;
    }

    // Hàm xung đơn vị δ(n)
    private int delta(int n) {
        return n == 0 ? 1 : 0;
    }

    // Phương thức hiển thị các giá trị tín hiệu
    public void displaySignal() {
        System.out.print("Discrete Signal Values: ");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

// Lớp Radar phân tích tín hiệu
class Radar {
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
git bra