package training.assignment.pages;

import org.openqa.selenium.By;

public class CartPage {

	public static String ProductUrl = "https://www.flipkart.com/death-inside-story/p/itma6748d64c5c44?pid=9780143450832&lid=LSTBOK9780143450832BGWASM&marketplace=FLIPKART&store=bks&srno=b_1_1&otracker=clp_omu_Popular%2BAuthors%2B_2_18.dealCard.OMU_the-non-fiction-store_the-non-fiction-store_SO48VEYM9GXM_6&otracker1=clp_omu_PINNED_neo%2Fmerchandising_Popular%2BAuthors%2B_NA_dealCard_cc_2_NA_view-all_6&fm=neo%2Fmerchandising&iid=9f0a8634-8606-4b00-b234-2bb383c77ec7.9780143450832.SEARCH&ppt=clp&ppn=the-non-fiction-store&ssid=lskq431vr40000001665078732260";
	public static By AddToCartBtn = By.className("_1KOMV2");
	public static By RemoveBtn = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[2]/div[2]/div[2]");
	public static By ConfirmRemove = By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[3]/div/div[2]");
	
}
