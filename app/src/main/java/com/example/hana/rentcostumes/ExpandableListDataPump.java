package com.example.hana.rentcostumes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Annisa on 12/17/2016.
 */

// In the above code the expandableListDetail object
// is used to map the group header strings to their respective children using an ArrayList of Strings.

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> cricket = new ArrayList<String>();
        cricket.add("If your item hasn’t turned up yet, contact the seller directly to ask for help. Sometimes an item takes a little longer than expected to be delivered, or gets lost in the post and good communication can be enough to resolve most issues.\n" + "Ask the seller if the item has been shipped and if they are able to provide you with proof of shipping or a tracking code for you to check the status of your order.\n" +
                "If the seller doesn’t get back to you or if you can’t find a solution, please report the issue through the in-app Help section (Profile > Support > Help > Report a transaction problem > Select the transaction you wish to report). Please note that if you paid outside of the app, you will need to scroll to the bottom of your list of transactions and select 'item not shown'.\n" +
                "If you have paid in-app you are covered by Buyer Protection. In this case we will contact the seller and give you instructions on the next steps to take. Unfortunately out-of-app payments such as bank transfers, direct PayPal payments, swaps or cash payments do not offer any protection and there might be very little we can do to help in those cases. Please report the issue anyway so we can work together to keep Depop a safe app.\n" +
                "Depending on the type of transaction (Classic Payment or Depop Wallet) most cases are investigated within 14 days. We understand this may be a frustrating wait but we will do our best to make sure the problem is sorted as soon as possible.");


        List<String> football = new ArrayList<String>();
        football.add("We work hard everyday to keep Depop a safe and fun marketplace.\n" +
                "However sometimes things don’t go as expected. Here we've put together a few tips on how to sell safely and avoid any problems.\n" +
                "1. Only sell in-app. To be paid on Depop, you need to have either a PayPal account linked to your Depop shop, or Depop Wallet. Payment methods outside the app, such as bank transfers, direct PayPal payments, cash or other methods, are not safe and you will not be covered by Seller Protection if something goes wrong. \n" +
                "2. Make sure the payment has cleared. Some payments might take longer to clear to your account so be patient. If you ship the item before receiving the payment, you will not be covered by Seller Protection if anything goes wrong.\n" +
                "3. Send the item to the address located in your Sold Items list to be covered by Seller Protection. If you ship it to another address, you will not be covered. If the buyer asks you to ship to another address, tell them you will have to refund them the item, ask them to update their Depop address and then buy the item again. If the address isn’t visible, it may be because the buyer picked the option 'Meet in person'. Be aware that this option is not covered by Seller Protection either.\n" +
                "4. Ship using a tracked and signed for delivery method. We recommend you use tracked and signed for shipping whenever possible for peace of mind on both sides of the transaction. This is also required in order to be eligible for Seller Protection. Tracking numbers aren’t always free, so remember to take that price into consideration when setting shipping prices.\n" +
                "5. Keep your proof of postage. This way, if something goes wrong with the transaction you will be able to prove the item was sent. Keep in mind that, in order to be valid, your proof of postage needs to contain the buyer’s address and date of shipping.\n" +
                "6. Follow up. Send the buyer an in-app message to make sure that they have received the item and they're happy with it. This will prevent misunderstandings and possible disputes due to miscommunication.");


        List<String> basketball = new ArrayList<String>();
        basketball.add("If your item hasn’t turned up yet, contact the seller directly to ask for help. Sometimes an item takes a little longer than expected to be delivered, or gets lost in the post and good communication can be enough to resolve most issues.\n" +
                "Ask the seller if the item has been shipped and if they are able to provide you with proof of shipping or a tracking code for you to check the status of your order.\n" +
                "If the seller doesn’t get back to you or if you can’t find a solution, please report the issue through the in-app Help section (Profile > Support > Help > Report a transaction problem > Select the transaction you wish to report). Please note that if you paid outside of the app, you will need to scroll to the bottom of your list of transactions and select 'item not shown'.\n" +
                "If you have paid in-app you are covered by Buyer Protection. In this case we will contact the seller and give you instructions on the next steps to take. Unfortunately out-of-app payments such as bank transfers, direct PayPal payments, swaps or cash payments do not offer any protection and there might be very little we can do to help in those cases. Please report the issue anyway so we can work together to keep Depop a safe app.\n" +
                "Depending on the type of transaction (Classic Payment or Depop Wallet) most cases are investigated within 14 days. We understand this may be a frustrating wait but we will do our best to make sure the problem is sorted as soon as possible.");


        expandableListDetail.put("How can I rent safely ?", cricket);
        expandableListDetail.put("How can  I sell safely ?", football);
        expandableListDetail.put("I haven't received my item", basketball);
        return expandableListDetail;
    }
}
