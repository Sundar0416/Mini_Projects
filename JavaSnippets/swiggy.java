package pgm;
import java.util.Scanner;
public class swiggy {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		boolean flag=true;
		System.out.println("\t\t\tWelcome to swiggy");
		System.out.println("\t\t\t-----------------");
		do
		{
			System.out.println("\t\t\tSelect the Hotel");
			System.out.println("1.Hotel Buhari\n2.Hotel A2B\n3.Hotel Amma Canteen\n4.Hotel Bilal\n[[[5.Exit]]]");
			int Hotel_selection=sc.nextInt();
			switch(Hotel_selection) 
			{
				case 1:
				{
					System.out.println("\t\t\tGreetings from Buhari");
					System.out.println("\t\t\t---------------------");
					System.out.println("\t\t\tSelect your Fav_food");
					System.out.println("1.Mutton Biryani\n2.Chicken Biryani\n3.Chicken-65\n4.Mutton chutka");
					int food_selection=sc.nextInt();
					switch(food_selection) 
					{
						case 1:
						{
							double price=340;
							System.out.println("Price of 1 Mutton Biryani : $"+price );
							System.out.print("How many do you want? (in count) : ");
							int qty=sc.nextInt();
							double total_sys_amo=qty*price;
							System.out.println("The total bill amount : $"+total_sys_amo);
							System.out.println("Select the Payment mode");
							System.out.println("1.Google Pay\n2.Phone pay");
							int payment_mode=sc.nextInt();
							switch(payment_mode)
							{
								case 1:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								case 2:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order Placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								default:
								{
									System.out.println("Invalid payment method\nOrder Failed");
									break;
								}
							}
							break;
						}
						case 2:
						{
							double price=280;
							System.out.println("Price of 1 Chicken Biryani : $"+price );
							System.out.print("How many do you want? (in count) : ");
							int qty=sc.nextInt();
							double total_sys_amo=qty*price;
							System.out.println("The total bill amount : $"+total_sys_amo);
							System.out.println("Select the Payment mode");
							System.out.println("1.Google Pay\n2.Phone pay");
							int payment_mode=sc.nextInt();
							switch(payment_mode)
							{
								case 1:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								case 2:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order Placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								default:
								{
									System.out.println("Invalid payment method\nOrder Failed");
									break;
								}
							}
							break;
						}
						case 3:
						{
							double price=105;
							System.out.println("Price of 1 Chicken-65 : $"+price );
							System.out.print("How many do you want? (in count) : ");
							int qty=sc.nextInt();
							double total_sys_amo=qty*price;
							System.out.println("The total bill amount : $"+total_sys_amo);
							System.out.println("Select the Payment mode");
							System.out.println("1.Google Pay\n2.Phone pay");
							int payment_mode=sc.nextInt();
							switch(payment_mode)
							{
								case 1:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								case 2:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order Placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								default:
								{
									System.out.println("Invalid payment method\nOrder Failed");
									break;
								}
							}
							break;
						}
						case 4:
						{
							double price=145;
							System.out.println("Price of 1 Mutton chutka : $"+price );
							System.out.print("How many do you want? (in count) : ");
							int qty=sc.nextInt();
							double total_sys_amo=qty*price;
							System.out.println("The total bill amount : $"+total_sys_amo);
							System.out.println("Select the Payment mode");
							System.out.println("1.Google Pay\n2.Phone pay");
							int payment_mode=sc.nextInt();
							switch(payment_mode)
							{
								case 1:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								case 2:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order Placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								default:
								{
									System.out.println("Invalid payment method\nOrder Failed");
									break;
								}
							}
							break;
						}
						default:
						{
							System.out.println("Invalid food choice\nBetter luck next time");
							break;
						}
					}
					    break;
				}
				case 2:
				{
					System.out.println("\t\t\tGreetings from A2B");
					System.out.println("\t\t\t---------------------");
					System.out.println("\t\t\tSelect your Fav_food");
					System.out.println("1.Idli\n2.Dosa\n3.Poori\n4.Pongal");
					int food_selection=sc.nextInt();
					switch(food_selection) 
					{
						case 1:
						{
							double price=17;
							System.out.println("Price of 1 Idli : $"+price );
							System.out.print("How many do you want? (in count) : ");
							int qty=sc.nextInt();
							double total_sys_amo=qty*price;
							System.out.println("The total bill amount : $"+total_sys_amo);
							System.out.println("Select the Payment mode");
							System.out.println("1.Google Pay\n2.Phone pay");
							int payment_mode=sc.nextInt();
							switch(payment_mode)
							{
								case 1:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								case 2:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order Placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								default:
								{
									System.out.println("Invalid payment method\nOrder Failed");
									break;
								}
							}
							break;
						}
						case 2:
						{
							double price=85;
							System.out.println("Price of 1 Dosa : $"+price );
							System.out.print("How many do you want? (in count) : ");
							int qty=sc.nextInt();
							double total_sys_amo=qty*price;
							System.out.println("The total bill amount : $"+total_sys_amo);
							System.out.println("Select the Payment mode");
							System.out.println("1.Google Pay\n2.Phone pay");
							int payment_mode=sc.nextInt();
							switch(payment_mode)
							{
								case 1:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								case 2:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order Placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								default:
								{
									System.out.println("Invalid payment method\nOrder Failed");
									break;
								}
							}
							break;
						}
						case 3:
						{
							double price=35;
							System.out.println("Price of 1 Poori : $"+price );
							System.out.print("How many do you want? (in count) : ");
							int qty=sc.nextInt();
							double total_sys_amo=qty*price;
							System.out.println("The total bill amount : $"+total_sys_amo);
							System.out.println("Select the Payment mode");
							System.out.println("1.Google Pay\n2.Phone pay");
							int payment_mode=sc.nextInt();
							switch(payment_mode)
							{
								case 1:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								case 2:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order Placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								default:
								{
									System.out.println("Invalid payment method\nOrder Failed");
									break;
								}
							}
							break;
						}
						case 4:
						{
							double price=75;
							System.out.println("Price of 1 Pongal : $"+price );
							System.out.print("How many do you want? (in count) : ");
							int qty=sc.nextInt();
							double total_sys_amo=qty*price;
							System.out.println("The total bill amount : $"+total_sys_amo);
							System.out.println("Select the Payment mode");
							System.out.println("1.Google Pay\n2.Phone pay");
							int payment_mode=sc.nextInt();
							switch(payment_mode)
							{
								case 1:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								case 2:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order Placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								default:
								{
									System.out.println("Invalid payment method\nOrder Failed");
									break;
								}
							}
							break;
						}
						default:
						{
							System.out.println("Invalid food choice\nBetter luck next time");
							break;
						}
					}
					    break;
				}
				case 3:
				{
					System.out.println("\t\t\tGreetings from Amma Canteen");
					System.out.println("\t\t\t---------------------");
					System.out.println("\t\t\tSelect your Fav_food");
					System.out.println("1.Sambar saadam\n2.Lemon saadam\n3.Puli saadam\n4.Pudhina saadam");
					int food_selection=sc.nextInt();
					switch(food_selection) 
					{
						case 1:
						{
							double price=7;
							System.out.println("Price of 1 Sambar saadam : $"+price );
							System.out.print("How many do you want? (in count) : ");
							int qty=sc.nextInt();
							double total_sys_amo=qty*price;
							System.out.println("The total bill amount : $"+total_sys_amo);
							System.out.println("Select the Payment mode");
							System.out.println("1.Google Pay\n2.Phone pay");
							int payment_mode=sc.nextInt();
							switch(payment_mode)
							{
								case 1:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								case 2:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order Placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								default:
								{
									System.out.println("Invalid payment method\nOrder Failed");
									break;
								}
							}
							break;
						}
						case 2:
						{
							double price=3;
							System.out.println("Price of 1 Lemon saadam : $"+price );
							System.out.print("How many do you want? (in count) : ");
							int qty=sc.nextInt();
							double total_sys_amo=qty*price;
							System.out.println("The total bill amount : $"+total_sys_amo);
							System.out.println("Select the Payment mode");
							System.out.println("1.Google Pay\n2.Phone pay");
							int payment_mode=sc.nextInt();
							switch(payment_mode)
							{
								case 1:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								case 2:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order Placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								default:
								{
									System.out.println("Invalid payment method\nOrder Failed");
									break;
								}
							}
							break;
						}
						case 3:
						{
							double price=5;
							System.out.println("Price of 1 Puli saadam : $"+price );
							System.out.print("How many do you want? (in count) : ");
							int qty=sc.nextInt();
							double total_sys_amo=qty*price;
							System.out.println("The total bill amount : $"+total_sys_amo);
							System.out.println("Select the Payment mode");
							System.out.println("1.Google Pay\n2.Phone pay");
							int payment_mode=sc.nextInt();
							switch(payment_mode)
							{
								case 1:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								case 2:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order Placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								default:
								{
									System.out.println("Invalid payment method\nOrder Failed");
									break;
								}
							}
							break;
						}
						case 4:
						{
							double price=6;
							System.out.println("Price of 1 Pudhina saadam : $"+price );
							System.out.print("How many do you want? (in count) : ");
							int qty=sc.nextInt();
							double total_sys_amo=qty*price;
							System.out.println("The total bill amount : $"+total_sys_amo);
							System.out.println("Select the Payment mode");
							System.out.println("1.Google Pay\n2.Phone pay");
							int payment_mode=sc.nextInt();
							switch(payment_mode)
							{
								case 1:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								case 2:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order Placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								default:
								{
									System.out.println("Invalid payment method\nOrder Failed");
									break;
								}
							}
							break;
						}
						default:
						{
							System.out.println("Invalid food choice\nBetter luck next time");
							break;
						}
					}
					    break;
				}
				case 4:
				{
					System.out.println("\t\t\tGreetings from Bilal");
					System.out.println("\t\t\t---------------------");
					System.out.println("\t\t\tSelect your Fav_food");
					System.out.println("1.Grilled Salmon\n2.Butter Chicken (Murgh Makhani)\n3.Prawn Masala\n4.Mutton Korma");
					int food_selection=sc.nextInt();
					switch(food_selection) 
					{
						case 1:
						{
							double price=183;
							System.out.println("Price of 1 Grilled Salmon : $"+price );
							System.out.print("How many do you want? (in count) : ");
							int qty=sc.nextInt();
							double total_sys_amo=qty*price;
							System.out.println("The total bill amount : $"+total_sys_amo);
							System.out.println("Select the Payment mode");
							System.out.println("1.Google Pay\n2.Phone pay");
							int payment_mode=sc.nextInt();
							switch(payment_mode)
							{
								case 1:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								case 2:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order Placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								default:
								{
									System.out.println("Invalid payment method\nOrder Failed");
									break;
								}
							}
							break;
						}
						case 2:
						{
							double price=249;
							System.out.println("Price of 1 Butter Chicken (Murgh Makhani) : $"+price );
							System.out.print("How many do you want? (in count) : ");
							int qty=sc.nextInt();
							double total_sys_amo=qty*price;
							System.out.println("The total bill amount : $"+total_sys_amo);
							System.out.println("Select the Payment mode");
							System.out.println("1.Google Pay\n2.Phone pay");
							int payment_mode=sc.nextInt();
							switch(payment_mode)
							{
								case 1:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								case 2:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order Placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								default:
								{
									System.out.println("Invalid payment method\nOrder Failed");
									break;
								}
							}
							break;
						}
						case 3:
						{
							double price=137;
							System.out.println("Price of 1 Prawn Masala : $"+price );
							System.out.print("How many do you want? (in count) : ");
							int qty=sc.nextInt();
							double total_sys_amo=qty*price;
							System.out.println("The total bill amount : $"+total_sys_amo);
							System.out.println("Select the Payment mode");
							System.out.println("1.Google Pay\n2.Phone pay");
							int payment_mode=sc.nextInt();
							switch(payment_mode)
							{
								case 1:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								case 2:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order Placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								default:
								{
									System.out.println("Invalid payment method\nOrder Failed");
									break;
								}
							}
							break;
						}
						case 4:
						{
							double price=295;
							System.out.println("Price of 1 Mutton korma : $"+price );
							System.out.print("How many do you want? (in count) : ");
							int qty=sc.nextInt();
							double total_sys_amo=qty*price;
							System.out.println("The total bill amount : $"+total_sys_amo);
							System.out.println("Select the Payment mode");
							System.out.println("1.Google Pay\n2.Phone pay");
							int payment_mode=sc.nextInt();
							switch(payment_mode)
							{
								case 1:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								case 2:
								{
									System.out.print("Enter the total bill amount : $");
									double total_user_amo=sc.nextDouble();
									if(total_sys_amo==total_user_amo) {
										int sys_otp=(int)(Math.random()*9999+9999);
										System.out.println("\t\t\tGenerating OTP...");
										Thread.sleep(3000);
										System.out.println("OTP : "+sys_otp);
										System.out.print("Enter this OTP : ");
										int user_otp=sc.nextInt();
										if(sys_otp==user_otp) {
											System.out.println("Order Placed");
										}
										else {
											System.out.println("Invalid OTP\nOrder Failed");
										}
									}
									else {
										System.out.println("Invalid Total amount\nOrder Failed");
									}
									break;
								}
								default:
								{
									System.out.println("Invalid payment method\nOrder Failed");
									break;
								}
							}
							break;
						}
						default:
						{
							System.out.println("Invalid food choice\nBetter luck next time");
							break;
						}
					}
					    break;
				}
				case 5:
				{
					System.out.println("Exiting.....");
					Thread.sleep(2000);
					System.out.println("Thank you\nVisit again");
					flag=false;
					break;
				}
				default:
				{
					System.out.println("Invalid Hotel choice\nBetter luck next time");
					break;
				}
			}
		}
		while(flag);
	}
}
