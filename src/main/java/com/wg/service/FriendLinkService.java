package com.wg.service;

import com.wg.model.FriendLink;
import com.wg.utils.DataMap;

/**
 * @author: insane
 * @Date: 2019/5/16 17:08
 * Describe:
 */
public interface FriendLinkService {

    DataMap addFriendLink(FriendLink friendLink);

    DataMap getAllFriendLink();

    DataMap updateFriendLink(FriendLink friendLink, int id);

    DataMap deleteFriendLink(int id);

    DataMap getFriendLink();
}
