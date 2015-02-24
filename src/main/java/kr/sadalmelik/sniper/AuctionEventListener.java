package kr.sadalmelik.sniper;

import java.util.EventListener;

/**
 * Created by SejongPark on 15. 2. 24..
 */
public interface AuctionEventListener extends EventListener {
    public void auctionClosed();
}
