package kr.sadalmelik.sniper;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.packet.Message;

/**
 * Created by SejongPark on 15. 2. 24..
 */
public class AuctionMessageTranslator implements MessageListener{
    private final AuctionEventListener listener;

    public AuctionMessageTranslator(AuctionEventListener listener) {
        this.listener = listener;
    }

    public void processMessage(Chat chat, Message message) {
        listener.auctionClosed();
    }
}
