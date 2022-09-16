import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
//        문제1) 점수를 입력받아 점수 및 등급을 출력하는 프로그램을 작성하세요
//        else if 문을 사용하여 작성
//        95이상 = A+, 90이상 = A, 85이상 = B+, 80이상 = B, 75이상 = C+, 70이상 = C, 60이상 = D, 60미만 = F
//        중첩 if 문을 사용하여 각각의 + 대의 점수를 출력

//        System.out.println("점수는 입력 해주세요");
        Scanner scan = new Scanner(System.in);
//        int grade = scan.nextInt();

//        if (grade >= 95) {
//            System.out.println("점수는 " + grade + "이고 등급은 A+ 입니다");
//        } else if (grade >= 90) {
//            System.out.println("점수는 " + grade + "이고 등급은 A 입니다");
//        } else if (grade >= 85) {
//            System.out.println("점수는 " + grade + "이고 등급은 B+ 입니다");
//        } else if (grade >= 80) {
//            System.out.println("점수는 " + grade + "이고 등급은 B 입니다");
//        } else if (grade >= 75) {
//            System.out.println("점수는 " + grade + "이고 등급은 C+ 입니다");
//        } else if (grade >= 70) {
//            System.out.println("점수는 " + grade + "이고 등급은 C 입니다");
//        } else if (grade >= 60) {
//            System.out.println("점수는 " + grade + "이고 등급은 D 입니다");
//        } else {
//            System.out.println("점수는 " + grade + "이고 등급은 F 입니다");
//        }
//        String level = "F";
//        if (grade >= 90){
//            if (grade >= 95){
//                level ="A+";
//            }
//        }
//        else if (grade >= 80){
//            if (grade >= 85) {
//                level = "B+";
//            }
//        }
//        else if (grade >= 70){
//            if (grade >= 75) {
//                level = "C+";
//            }
//        }
//        else if (grade >= 60){
//            if (grade >= 65) {
//                level = "D";
//            }
//        }
//        else {
//            level ="F";
//        }
//
//        System.out.println("점수는 " + grade + "이고 등급은 " + level + " 입니다");


//      6번 문제
//        돈의 액수를 입력받아 오만원권, 만원건, 천원권, 500원짜리 동전, 100원짜리 동전, 10원짜리 동전, 1원짜리 동전
//        각 몇개로 변환되는지 출력하라.
//        돈의 액수를 입력하세요>>65245
//        오만원건1개, 만원1개, 천원5개, 500원0개, 100원2개, 10원4개, 1원5개

        System.out.println("돈의 액수를 입력하세요>>");
        int money = scan.nextInt();

        int m50000 = money / 50000; // 원금 / 50000 해서 5만원권을 수 확인
        money = money % 50000; //5만원을 뺀 15245 원을 변수 money 에 저장

        int m10000 = money / 10000; // 1만원권을 수를 확인하기 위해서 10000으로 나눔
        money = money % 10000; // 1만원권을 제외한 금액을 저장하기 위해서 나머지 연산

        int m1000 = money / 1000; // 5,245원에서 1천원권의 수를 확인하기 위해서 1000으로 나눔
        money = money % 1000; // 5000을 뺀 나머지 금액을 계산하기 위해서 나머지 연산

        int m500 = money / 500; // 245원에서 500원 동전의 수를 확인하기 위해서 500으로 나눔
        money = money % 500; // 500을 나눈 후 나머지 금액을 계산하기 위해서 나머지 연산

        int m100 = money / 100; // 245에서 100원 동전의 수를 확인하기 위해서 100으로 나눔
        money = money % 100; // 200을 뺀 나머지 값을 계산

        int m10 = money / 10; // 45에서 10원 동전의 수 계산
        money = money % 10; // 1원 동전 수 계산


        System.out.println("오만원권은" + m50000 + "개");
        System.out.println("만원권은"  + m10000 + "개");
        System.out.println("천원권은"  + m1000 + "개");
        System.out.println("500원짜리 동전은"  + m500 + "개");
        System.out.println("100원짜리 동전은"  + m100 + "개");
        System.out.println("10원짜리 동전은"  + m10 + "개");
        System.out.println("1원짜리 동전은"  + money + "개");


//      7번 문제
//        학점이 A, B이면, "Excellent", 학점이 C,D이면 "Good", 학점이 F이면 "Bye"라고
//        출력하는 프로그램을 작성하라. switch와 break를 활용하라
//        학점을 입력하세요>>B
//        Excellent

        System.out.println("학점을 입력하세요>>");
        String level = scan.next();

        switch (level) {

            case "A":
            case "B":
                System.out.println("Excellent");
                break;

            case "C":
            case "D":
                System.out.println("Good");
                break;

            case "F":
                System.out.println("Bye");
                break;
        }


//      9번 문제
//        369게임의 일부를 작성해보자. 1~99까지의 정수를 입력받고 수에 3, 6, 9 중 하나가 있는 경우는 "박수짝"
//        두 개 있는 경우는 "박수짝짝", 하나도 없으면 "박수없음"을 출력하는 프로그램을 작성하라. 예를 들면,
//        13인 경우 "박수짝", 36인 경우 "박수짝짝", 5인 경우 "박수없음"을 출력하면 된다.
//        1~99 사이의 정수를 입력하세요>>36
//        박수짝짝


        System.out.println("1~99 사이의 정수를 입력하세요>>");
        int number = scan.nextInt();
        // 37 에서 앞자리는 10의자리 뒷자리는 1의 자리

        int first = number / 10; // 10의 자리 숫자를 저장
        int second = number % 10; // 1의 자리 숫자를 저장
        int count = 0; // 3, 6, 9 의 수를 저장하기 위한 변수

        if ((first % 3 == 0) && (second % 3 == 0)) {
            System.out.println("박수 짝짝");
        } else if ((first % 3 == 0) ^ (second % 3 ==0)) {
            System.out.println("박수 짝");
        } else {
            System.out.println("박수 없음");
        }

//        3/3은 = 나머지 0 이후, 카운트 + 1
//        10의 자리 숫자가 3의 배수인지 확인
//        if (first % 3 ==0){
//            count++; // 3의 배수이면, 변수 count의 값 1 증가
//        }
//
////        7%3 = 1, 0이 아니기 때문에 false, 무시하고 넘어감
////        1의 자리 숫자가 3의 배수인지 확인
//        if (second % 3 ==0){
//            count ++; // 3의 배수이면 변수 count의 값 1 증가
//        }

//        if (count == 1) {
//            System.out.println("박수 짝");
//        } else if (count == 2) {
//            System.out.println("박수 짝짝");
//        } else {
//            System.out.println("박수 없음");
//        }


//        가위바위보 게임
//        두 사람이 하는 가위바위보 게임을 만들어보자. 두 사람의 이름은 '철수'와 '영희'이다. 먼저"철수"를 출력하고
//        "가위", "바위", "보" 중 하나를 문자열로 입력받는다. "영희"에 대해서 마찬가지 방법으로 입력받는다.
//        두 사람으로부터 문자열을 입력받은 후 누가 이겼는지 판별하여 승자를 출력한다.
//        가위 바위 보게임입니다. 가위, 바위, 보 중에서 입력하세요
//        철수 >> 가위
//        영희 >> 보
//        철수가 이겼습니다.

        System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        String game = scan.next();

        if (game == null) {
            
        }


    }
}
