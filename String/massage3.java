package String;

public class massage3 {
    public static void main(String[] args) {
        String info = "“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}”";
        int senderStart = info.indexOf("<");
        int senderEnds = info.indexOf(">")+1;

        int numberStart = info.indexOf("[");
        int numberEnds = info.indexOf("]")+1;

        int messageStarts = info.indexOf("{");
        int messageEnds = info.indexOf("}")+1;

        String sender = info.substring(senderStart,senderEnds);
        String number = info.substring(numberStart,numberEnds);
        String message = info.substring(messageStarts,messageEnds);
        System.out.println("Sender " +sender);
        System.out.println("Number: " +number);
        System.out.println("Message: " + message);


    }
}

