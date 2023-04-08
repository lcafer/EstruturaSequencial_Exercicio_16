package EstruturaSequencial_Exercicio_16;
import java.util.Scanner;

public class InkCanShop {
    static float SQUARE_METERS_PER_LITERS = 3.0f;
	static float CAN_PRICE = 80.00f;
	static int INK_CAN_LITERS = 18;
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Qual o tamanho da área em metros quadrados a ser pintada?");
		float areaInput = userInput.nextFloat();
		float litersQuantity = areaInput /SQUARE_METERS_PER_LITERS;
		int inkCan = (int) Math.ceil(litersQuantity / INK_CAN_LITERS);
		float can_price = inkCan * CAN_PRICE;
		System.out.print("Você precisa de: " + inkCan + " latas de tinta. O preço ficará: R$ " + can_price);
        userInput.close();
    }
}
