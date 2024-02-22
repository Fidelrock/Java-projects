import java.util.Random;
class LetterGrades{
    public static void main(String[]args){
        Random random = new Random();

        //int score = 40 + random.nextInt(60);

        int score = random.nextInt(40,99);

        System.out.println("Your test score was "+score);

        String sign = "";
        if(score%10 <2) sign ="-";
        if(score%10 >7) sign = "+";

        switch(score/10){
            case 9:{
                System.out.println("n A "+sign+". Excellent");
                break;
            }
            case 8:{
                System.out.println("B "+sign+". Nice work.");
                break;
            }
            case 7:{
                System.out.println("C "+sign+". You can do better.");
                break;
            }
            case 6:{
                System.out.println("D "+sign+". See me after class.");
                break;
            }
            default :{
                System.out.println("F "+sign+". Get a Job.");
                break;
            }
        }
    }
}