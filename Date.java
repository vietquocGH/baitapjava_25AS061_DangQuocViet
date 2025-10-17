public class Date {
        private int day;
        private int month;
        private int year;
        public Date(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public int getDay() {
            return day;
        }
        public int getMonth() {
            return month;
        }
        public int getYear() {
            return year;
        }
        public void setDay(int day) {
            this.day = day;
        }
        public void setMonth(int month) {
            this.month = month;
        }
        public void setYear(int year) {
            this.year = year;
        }
        public void setDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        @Override
        public String toString() {
            return String.format("%02d/%02d/%04d", day, month, year);
        }
        public static void main(String[] args) {
            Date d1 = new Date(1, 1, 2024);
            System.out.println("Ngày ban đầu: " + d1.toString());

            d1.setDay(15);
            d1.setMonth(10);
            d1.setYear(2025);
            System.out.println("Ngày sau khi set từng phần: " + d1.toString());
            d1.setDate(5, 3, 2026);
            System.out.println("Ngày sau khi setDate: " + d1.toString());
            System.out.println("Ngày: " + d1.getDay());   
            System.out.println("Tháng: " + d1.getMonth());   
            System.out.println("Năm: " + d1.getYear());    
        }
    }

